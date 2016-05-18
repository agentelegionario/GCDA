package cdpa.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import gcda.business.Cidade;
import gcda.business.Manancial;
import gcda.business.OrgMilitar;
import gcda.business.PAbastecimento;
import gcda.business.Rota;
import gcda.controller.CidadeController;
import gcda.controller.ManancialController;
import gcda.controller.OrgMilitarController;
import gcda.controller.PAController;
import gcda.controller.RotaController;


public class ParseCsv {

	
	
	public static List<Manancial>  lerMananciaisCSV() {
		List<Manancial> manaciais = new ArrayList<>();
		CidadeController cidadeController = new CidadeController();
		OrgMilitarController omController = new OrgMilitarController();
		ManancialController manancialController = new ManancialController();
		try {
			
			File file = new File(System.getProperty("user.dir") + "\\src\\main\\webapp\\res\\lista_coord_manancial_7077.csv"); //para localHost
			FileReader fileReader = new FileReader(file);
			BufferedReader reader = new BufferedReader(fileReader);
			String data = null;
			data = reader.readLine();
			while((data = reader.readLine()) != null){
				String[] temp = data.split(",");
				Manancial m = new Manancial();
				m.setId(Integer.parseInt(temp[0]));
				m.setLatitude(Double.parseDouble(temp[1]));
				m.setLongitude(Double.parseDouble(temp[2]));
				m.setNome(temp[3]);
				m.setTipo(temp[4]);
				OrgMilitar om = omController.EncontraOrgMilitar(Integer.parseInt(temp[7]));
				System.out.println(temp[7]);
				System.out.println(om);
				if(om == null){
					om = new OrgMilitar();	//Org Militar detached ainda
					om.setId(Integer.parseInt(temp[7]));
					om.setNome("Comando Militar " + temp[7]);
					om.setSigla("CM" + temp[7]);
				}
				Cidade cidade = cidadeController.encontraCidadePorNome(temp[6]);
				if(cidade == null){
					cidade = new Cidade();
					cidade.setEstado(temp[5]);
					cidade.setNome(temp[6]);
					cidade.setOrgMilitar(om);
					cidadeController.inserirCidade(cidade);
					cidade = cidadeController.encontraCidadePorNome(cidade.getNome());
				}else{
					cidade.setOrgMilitar(om);
				}
				m.setCidade(cidade);
				manancialController.InserirManacial(m);
				manaciais.add(m);
			}
			fileReader.close();
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return manaciais;	
		
	}
	
	public static List<PAbastecimento>  lerPAsCSV() {
		List<PAbastecimento> PAs = new ArrayList<>();
		RotaController rotaController = new RotaController();
		ManancialController manancialController = new ManancialController();
		OrgMilitarController orgMilitarController = new OrgMilitarController();
		PAController paController = new PAController();
		CidadeController cidadeController = new CidadeController();
		try {
			
			File file = new File(System.getProperty("user.dir") + "\\src\\main\\webapp\\res\\lista_coord_cisternas_7752.csv");
			FileReader fileReader = new FileReader(file);
			BufferedReader reader = new BufferedReader(fileReader);
			String data = null;
			data = reader.readLine();
			while((data = reader.readLine()) != null){
				String[] temp = data.split(",");
				PAbastecimento pa = new PAbastecimento();
				Manancial manancial = new Manancial();
				Rota rota = new Rota();
				pa.setId(Integer.parseInt(temp[0]));
				pa.setLatitude(Double.parseDouble(temp[1]));
				pa.setLongitude(Double.parseDouble(temp[2]));
				manancial = manancialController.EncontraManancial(Integer.parseInt(temp[3]));
				rota.setManancial(manancial);
				rota.setDistancia(Double.parseDouble(temp[4]));
				rota.setDataCadastro(new Date());
				pa.getRotas().add(rota);
				pa.setVolume(Integer.parseInt(temp[5]));
				pa.setNumeroDePessoas(Integer.parseInt(temp[6]));
				pa.setBairro(temp[7]);
				pa.setResposavel(temp[8]);
				
				OrgMilitar om = orgMilitarController.EncontraOrgMilitar(Integer.parseInt(temp[9]));
				
				Cidade cidade = cidadeController.encontraCidadePorNome(temp[6]);
				if(cidade == null){
					cidade = new Cidade();
					cidade.setEstado("NULO" );
					cidade.setNome("NULO");
					cidade.setOrgMilitar(om);
				}else{
					cidade.setOrgMilitar(om);
				}
				pa.setCidade(cidade);
				paController.inserirPAbastecimento(pa);
				PAs.add(pa);
			}
			fileReader.close();
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return PAs;	
		
	}
	public static void main(String[] args) {
		List<Manancial> m = lerMananciaisCSV();
		
		/*for (Manancial man : m) {
			System.out.println(man);
			
		}*/
		System.out.println("\n");
		List<PAbastecimento> PAs = lerPAsCSV();
		for (PAbastecimento pAbastecimento : PAs) {
			System.out.println(pAbastecimento);
		}
	}
}

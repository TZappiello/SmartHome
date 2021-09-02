package smartHome;

import java.util.Scanner;

public class Base implements CasaInteligente {

	Scanner sc = new Scanner(System.in);

	String portar;
	String acenderr;
	String janelar;
	String arr;
	String assistirr;

	// Atributos
	private boolean portaAberta;
	private boolean acender;
	private boolean frio;
	private boolean assistir;

	// Métodos
	public boolean getPortaAberta() {
		return portaAberta;
	}

	public void setPortaAberta() {
		this.portaAberta = true;
	}

	public boolean getAcender() {
		return acender;
	}

	public void setAcender() {
		this.acender = true;
	}

	public boolean getFrio() {
		return frio;
	}

	public void setFrio() {
		this.frio = true;
	}

	public boolean getAssistir() {
		return assistir;
	}

	public void setAssistir() {
		this.assistir = true;
	}

	public Base() {
		
		// Metodos especiais: Construtor getters e setters;
		this.portaAberta = false;
		this.acender = true;
		this.frio = true;
		this.assistir = true;
	}

	@Override
	public void porta() {
		System.out.print("A porta esta aberta? S = sim, N = não ");
		this.portar = sc.nextLine();
		if (this.portar.equals("S") || this.portar.equals("s")) {
			System.out.println("Pode entrar >>>>");
		} else {
			System.out.println("Não pode entra porta trancada <<<");
			System.exit(0);
		}
	}

	@Override
	public void luz() {
		System.out.print("Acender luz? S = sim, N = não ");
		this.acenderr = sc.nextLine();
		if (this.acenderr.equals("S") || this.acenderr.equals("s"))
			System.out.println("Luz acesa >>>>");
		else
			System.out.println("Luz apagada <<<<");
	}

	@Override
	public void ar() {
		System.out.print("Ligar o ar? S = sim, N = não ");
		this.arr = sc.nextLine();
		if (this.arr.equals("S") || this.arr.equals("s"))
			System.out.println("Ar condicionado Ligado >>>>");
		else
			System.out.println("Ar condicionado desligado <<<<");

	}

	@Override
	public void tv() {
		System.out.print("Ligar TV? S = sim, N = não ");
		this.assistirr = sc.nextLine();
		if (this.assistirr.equals("S") || this.assistirr.equals("s"))
			System.out.println("TV ligada vamos assistir >>>>");
		else
			System.out.println("TV desligada <<<<");
	}

	@Override
	public void janela() {
		System.out.print("Abrir janela? S = sim, N = não ");
		this.janelar = sc.nextLine();
		if (this.janelar.equals("S") || this.janelar.equals("s"))
			System.out.println("Janela aberta com ar puro >>>>");
		else
			System.out.println("Janela fechada<<<<");
		sc.close();
	}

}

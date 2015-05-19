package teste02;

public enum Clubes
{
	FLAMENGO("Sudeste","Rio de Janeiro"),
	SAOPAULO("Sudeste","São Paulo"),
	CRUZEIRO("Sudeste","Minas Gerais"),
	GREMIO("Sul","Rio Grande do Sul"),
	GOIAS("Centro-OESTE","Goiás"),
	BAHIA("Nordeste","Bahia");
	
	private String regiao;
	private String estado;
	
	Clubes(String region, String state)
	{
		this.regiao = region;
		this.estado = state;
	}
	
	public String getRegiao()
	{
		return regiao;
	}
	
	public String getState()
	{
		return estado;
	}
}

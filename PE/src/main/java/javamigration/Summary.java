package javamigration;

public class Summary {

	private String id;
	private String name;
	private String company;

	public Summary() {}
	
	public Summary(String id, String name, String company)
	{
		super();
		this.id = id;
		this.name = name;
		this.company = company;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return company;
	}

	public void setDescription(String company) {
		this.company = company;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public String getId()
	{
		return id;
	}
}

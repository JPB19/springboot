@Entity
@Table(name = "producto")
public class Producto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private String type;
	private Integer price;
	@ManyToOne
	@JoinColumn(name = "car_type_id")
	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getType() {
		return clase;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public Integer getPrecio() {
		return precio;
	}
	
	public void setPrice(Integer price) {
		
		this.price = price;
	}
	
}

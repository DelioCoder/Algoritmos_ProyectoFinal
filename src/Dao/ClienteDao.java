package Dao;

import code.Cliente;
import java.util.ArrayList;
import java.util.function.Predicate;


public class ClienteDao
{
    private static ArrayList<Cliente> clientes = new ArrayList<>();
    private static int userCount = 1;
    
    static
    {
        
        clientes.add(new Cliente(userCount++, "Juan", "Perez", "12345678", "123-456-7890", "Calle 123", "Masculino", 25));
        clientes.add(new Cliente(userCount++, "Ana", "Gomez", "87654321", "987-654-3210", "Avenida Principal", "Femenino", 30));
        clientes.add(new Cliente(userCount++, "Carlos", "Lopez", "45678901", "555-555-5555", "Calle 456", "Masculino", 40));
        clientes.add(new Cliente(userCount++, "Maria", "Rodriguez", "78901234", "111-222-3333", "Avenida Secundaria", "Femenino", 35));
        clientes.add(new Cliente(userCount++, "David", "Martinez", "56789012", "777-888-9999", "Calle 789", "Masculino", 28));
        clientes.add(new Cliente(userCount++, "Luisa", "Hernandez", "34567890", "666-333-1111", "Avenida Tranquila", "Femenino", 22));
        clientes.add(new Cliente(userCount++, "Pedro", "Ramirez", "67890123", "999-000-1111", "Calle 890", "Masculino", 31));
        clientes.add(new Cliente(userCount++, "Elena", "Torres", "89012345", "444-555-6666", "Avenida Principal", "Femenino", 27));
        clientes.add(new Cliente(userCount++, "Sergio", "Ortega", "01234567", "888-777-6666", "Calle 901", "Masculino", 33));
        clientes.add(new Cliente(userCount++, "Laura", "Fernandez", "23456789", "222-333-4444", "Avenida Tranquila", "Femenino", 29));
        clientes.add(new Cliente(userCount++, "Andrea", "Gonzalez", "32109876", "333-444-5555", "Calle 567", "Femenino", 26));
        clientes.add(new Cliente(userCount++, "Javier", "Diaz", "21098765", "777-666-5555", "Avenida Principal", "Masculino", 32));
        clientes.add(new Cliente(userCount++, "Isabel", "Rojas", "45678901", "555-444-3333", "Calle 678", "Femenino", 24));
        clientes.add(new Cliente(userCount++, "Ricardo", "Vargas", "23456789", "222-111-3333", "Avenida Central", "Masculino", 29));
        clientes.add(new Cliente(userCount++, "Patricia", "Ferrer", "98765432", "999-888-7777", "Calle 345", "Femenino", 28));
        
    }
    
    public ArrayList<Cliente> getClientes()
    {
        return clientes;
    }
    
    public void insertarCliente(Cliente cliente)
    {
        System.out.println(cliente);
        
        cliente.setCodigo(userCount++);
        
        clientes.add(cliente);
    }
    
    public Cliente getCliente(int id)
    {
        
        return clientes.stream().filter((e) -> e.getCodigo().equals(id)).findFirst().orElse(null);
       
    }
    
    public void updatecliente(Cliente c)
    {
        
        Cliente cliente = clientes.stream().filter((e) -> e.getCodigo().equals(c.getCodigo())).findFirst().orElse(null);
        
        cliente.setCodigo(c.getCodigo());
        cliente.setNombre(c.getNombre());
        cliente.setApellidos(c.getApellidos());
        cliente.setDni(c.getDni());
        cliente.setDireccion(c.getDireccion());
        cliente.setTelefono(c.getTelefono());
        cliente.setSexo(c.getSexo());
        cliente.setEdad(c.getEdad());
        
        System.out.println(cliente);
    }
    
    public void deleteById(int id)
    {
        Predicate<? super Cliente> predicate = cliente -> cliente.getCodigo().equals(id);
        
        clientes.removeIf(predicate);
    }
    
    public Cliente confirmarInsert(int id)
    {
        
        Cliente cliente = clientes.stream().filter((e) -> e.getCodigo().equals(id)).findFirst().orElse(null);
        
        return cliente;
        
    }
}

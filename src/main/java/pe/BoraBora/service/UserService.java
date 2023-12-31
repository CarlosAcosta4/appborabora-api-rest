package pe.BoraBora.service;

import pe.BoraBora.entity.User;

public interface UserService {
	
	//--LOGIN
	public User login(String email, String pass);
	
	//--REGISTRAR USUARIO
	public abstract void insert(User user);
	boolean emailExists(String email);
	
	//--ACTUALIZAR CONTRASEÑA
	public User updatePassword(String email, String pass);
	
	//--VERIFICAR CONTRASEÑA
    public boolean checkPassword(String email, String pass);
	
    //--VERIFICAR SI EL ID DEL USUARIO EXISTE
    boolean existsById(Integer id);
    
    User getUserById(Integer id);
    void updateUser(User user);
    
    //--VERIFICAR SI EL DOCUMENTO DE IDENTIDAD EXISTE
    boolean docIdentidadExists(Integer docIdentidad);

    //--VERIFICAR SI EL TELEFONO EXISTE
    boolean telefonoExists(Integer telefono);
}

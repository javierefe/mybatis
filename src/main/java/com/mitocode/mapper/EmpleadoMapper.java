package com.mitocode.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.mitocode.model.Empleado;

@Mapper
public interface EmpleadoMapper {
	
	//Anotacion insert me va permitir insertar en la base de datos
	@Insert("INSERT INTO empleado(nombres,apellidos,documento,fechanacimiento,sueldo,"
			+ "numerohijos,usuario,clave) "
			+ "VALUES(#{nombres},#{apellidos},#{documento},#{fechaNacimiento},#{sueldo},"
			+ "#{numeroHijos},#{usuario},#{clave})")
	
	Integer registra(Empleado empleado);
	
	@Update("UPDATE empleado SET nombres = #{nombres} WHERE idempleado = #{idEmpleado}")
	
	Integer actualizar(Empleado empleado);
	
	@Delete("DELETE FROM empleado WHERE idempleado = #{idEmpleado}")
	
	Integer eliminar(Empleado empleado);
	
//	@Select("SELECT * FROM empleado WHERE idempleado = #{idEmpleado}")
	@Select("SELECT * FROM empleado")
	
	List<Empleado> obtenerEmpleado();
	//Empleado obtenerEmpleado(int id);
}

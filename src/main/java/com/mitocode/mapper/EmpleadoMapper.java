package com.mitocode.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.mitocode.model.Empleado;

@Mapper
public interface EmpleadoMapper {
	
	@Insert("INSERT INTO empleado(nombres,apellidos,documento,fechanacimiento,sueldo,"
			+ "numerohijos,usuario,clave) "
			+ "VALUES(#{nombres},#{apellidos},#{documento},#{fechaNacimiento},#{sueldo},"
			+ "#{numeroHijos},#{usuario},#{clave})")
	
	Integer registra(Empleado empleado);
	
	@Update("UPDATE empleado SET nombres = #{nombres} WHERE idempleado = #{idEmpleado}")
	Integer actualizar(Empleado empleado);
	
	
	@Select("")
	List<Empleado> obtenerEmpleado();
}

package com.mitocode;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.util.Assert;

import com.mitocode.mapper.EmpleadoMapper;
import com.mitocode.model.Empleado;

@SpringBootTest //para que spring reconozca que es una prueba 
@ContextConfiguration //carga toda la configutacion del proyecto para hacer una prueba
public class EmpleadoMapperTest {

	@Autowired
	private EmpleadoMapper empleadoMapper;
	
	@Test
	public void insert() {
		Empleado empleado = new Empleado();
		empleado.setNombres("Javier");
		empleado.setApellidos("Flores");
		empleado.setDocumento("87654321");
		empleado.setFechaNacimiento(LocalDate.now());
		empleado.setSueldo(2000);
		empleado.setNumeroHijos(0);
		empleado.setUsuario("admin");
		empleado.setClave("123456");
		
		int status = empleadoMapper.registra(empleado);
		Assert.state(status==1,"Insert Failed");
	}
	
	@Test
	public void update() {
		
		Empleado empleado = new Empleado();
		empleado.setNombres("Diego");
		empleado.setIdEmpleado(1);
		
		int status = empleadoMapper.actualizar(empleado);
		Assert.state(status == 1,"Update Failed");
		
	}
	
	@Test
	public void delete() {
		Empleado empleado = new Empleado();
		empleado.setIdEmpleado(3);
		
		int status = empleadoMapper.eliminar(empleado);
		Assert.state(status == 1, "Delete failed");
		
	}
	
	@Test
	public void obtener() {
		
		List<Empleado> empleado = empleadoMapper.obtenerEmpleado();
		empleado.forEach(System.out::println);

	}
	
	
}

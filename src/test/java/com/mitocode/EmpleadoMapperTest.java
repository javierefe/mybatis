package com.mitocode;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.util.Assert;

import com.mitocode.mapper.EmpleadoMapper;
import com.mitocode.model.Empleado;

@SpringBootTest
@ContextConfiguration
public class EmpleadoMapperTest {

	@Autowired
	private EmpleadoMapper empleadoMapper;
	
	@Test
	public void insert() {
		Empleado empleado = new Empleado();
		empleado.setNombres("Dany");
		empleado.setApellidos("Cenas Vasquez");
		empleado.setDocumento("12345678");
		empleado.setFechaNacimiento(LocalDate.now());
		empleado.setSueldo(1500);
		empleado.setNumeroHijos(0);
		empleado.setUsuario("Admin");
		empleado.setClave("123456");
		
		int status = empleadoMapper.registra(empleado);
		Assert.state(status==1,"Insert Failed");
	}
	
	@Test
	public void update() {
		
		Empleado empleado = new Empleado();
		empleado.setNombres("Javier");
		empleado.setIdEmpleado(1);
		
		int status = empleadoMapper.actualizar(empleado);
		Assert.state(status == 1,"Update Failed");
		
	}
	
	
}

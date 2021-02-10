package com.xworkz.matrimony;



import com.xworkz.matrimony.dao.MatrimonyDAO;
import com.xworkz.matrimony.dao.MatrimonyDAOImpl;
import com.xworkz.matrimony.dto.DTO;
import com.xworkz.matrimony.service.MaterimonyService;
import com.xworkz.matrimony.service.MaterimonyServiceImpl;

public class GetBrideApplication {

	public static void main(String[] args) {
		
		MatrimonyDAO matrimonydao=new MatrimonyDAOImpl();
		DTO dto3=matrimonydao.getById(2);
		System.out.println(dto3);
		
		MatrimonyDAO dao=new MatrimonyDAOImpl();
		MaterimonyService service=new MaterimonyServiceImpl(dao);
		DTO dto=service.getBride(1);
		
		if(dto!=null) {
		System.out.println(dto);
			}
		
		MatrimonyDAO dao1=new MatrimonyDAOImpl();
		DTO dto1=dao1.getAllBride();
		//System.out.println(dto1);

		MatrimonyDAO dao2=new MatrimonyDAOImpl();
		MaterimonyService service1=new MaterimonyServiceImpl(dao);
		DTO dto2=service1.getAllBride();
}
}

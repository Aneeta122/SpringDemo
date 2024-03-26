package com.example.demo.testing;



import java.nio.charset.Charset;

import org.hamcrest.core.Is;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import com.example.demo.controller.EmployeeController;
import com.example.demo.repository.EmployeeRepository;

@RunWith(SpringRunner.class) 
@WebMvcTest
@AutoConfigureMockMvc
public class UserControllerIntegrationTest {

    @MockBean
    private EmployeeRepository empRepository;
    
    @Autowired
    EmployeeController empController;

    @Autowired
    private MockMvc mockMvc;
    //positive testcase
//    @Test
//    public void whenPostRequestToUsersAndValidUser_thenCorrectResponse() throws Exception {
////        MediaType textPlainUtf8 = new MediaType(MediaType.TEXT_PLAIN, Charset.forName("UTF-8"));
//        String employee = "{\"firstname\": \"ananya\", \"lastname\" : \"sam\",\"employee_age\":23}";
//         mockMvc.perform(MockMvcRequestBuilders.post("/employee/add")
//          .content(employee)
//          .contentType(MediaType.APPLICATION_JSON))
//          .andExpect(MockMvcResultMatchers.status().isCreated());
//         
//        
//    }

//    negative testcase
//    @Test
//    public void whenPostRequestToUsersAndInValidUser_thenCorrectResponse() throws Exception {
//        String user = "{\"firstname\": \"\", \"lastname\" : \"sam\",\"employee_age\": 23}";
//        mockMvc.perform(MockMvcRequestBuilders.post("/employee/add")
//          .content(user)
//          .contentType(MediaType.APPLICATION_JSON))
//          .andExpect(MockMvcResultMatchers.status().isBadRequest());
//          
//           
//        }
//    
    
    //   null value
//    @Test
//    public void whenPostRequestToUsersAndInValidUser_firsname_null() throws Exception {
//        String user = "{\"firstname\": null, \"lastname\" : \"sam\",\"employee_age\":23}";
//        mockMvc.perform(MockMvcRequestBuilders.post("/employee/add")
//          .content(user)
//          .contentType(MediaType.APPLICATION_JSON))
//          .andExpect(MockMvcResultMatchers.status().isBadRequest());
//          
//           
//        }
    
    
    
//    @Test
//    public void whenPostRequestToUsersAndInValidUser__lastname_null() throws Exception {
//        String user = "{\"firstname\":\"ananya\", \"lastname\" : null,\"employee_age\":23}";
//        mockMvc.perform(MockMvcRequestBuilders.post("/employee/add")
//          .content(user)
//          .contentType(MediaType.APPLICATION_JSON))
//          .andExpect(MockMvcResultMatchers.status().isBadRequest());
//          
//           
//        }
//    
//    @Test
//    public void whenPostRequestToUsersAndInValidUser_age_null() throws Exception {
//        String user = "{\"firstname\":\"ananya\", \"lastname\" : \"sam\",\"employee_age\": null}";
//        mockMvc.perform(MockMvcRequestBuilders.post("/employee/add")
//          .content(user)
//          .contentType(MediaType.APPLICATION_JSON))
//          .andExpect(MockMvcResultMatchers.status().isBadRequest());
//          
//           
//        }
//    @Test
//    public void whenPostRequestToUsersAndInValidUser_age_invalide1() throws Exception {
//        String user = "{\"firstname\":\"ananya\", \"lastname\" : \"sam\",\"employee_age\": 1.15}";
//        mockMvc.perform(MockMvcRequestBuilders.post("/employee/add")
//          .content(user)
//          .contentType(MediaType.APPLICATION_JSON))
//          .andExpect(MockMvcResultMatchers.status().isBadRequest());
//          
//           
//        }
    
    //default


//@Test
//public void whenPostRequestToUsersAndInValidUser_firstname_default() throws Exception {
//    String user = "{\"firstname\":\"\", \"lastname\" : \"sam\",\"employee_age\":23}";
//      mockMvc.perform(MockMvcRequestBuilders.post("/employee/add")
//      .content(user)
//      .contentType(MediaType.APPLICATION_JSON))
//      .andExpect(MockMvcResultMatchers.status().isBadRequest());
//      
//       
//    }

//	@Test
//	public void whenPostRequestToUsersAndInValidUser_lasttname_default() throws Exception {
//		String user = "{\"firstname\":\"ananya\",\"lastname\":\"\",\"employee_age\":56}";
//		mockMvc.perform(MockMvcRequestBuilders.post("/employee/add")
//				.content(user).contentType(MediaType.APPLICATION_JSON))
//				.andExpect(MockMvcResultMatchers.status().isBadRequest());
//		
//
//	}
//	
    @Test
	public void whenPostRequestToUsersAndInValidUser_age_default() throws Exception {
		String user = "{\"firstname\":\"ananya\",\"lastname\":\"\",\"employee_age\":0.0}";
		mockMvc.perform(MockMvcRequestBuilders.post("/employee/add")
				.content(user).contentType(MediaType.APPLICATION_JSON))
				.andExpect(MockMvcResultMatchers.status().isBadRequest());
		

	}

}




    //...
    



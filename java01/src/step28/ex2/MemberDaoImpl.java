package step28.ex2;
/* JDBC bye
 */


import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;


public class MemberDaoImpl implements MemberDao{
  SqlSessionFactory sqlSessionFactory;

	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		this.sqlSessionFactory = sqlSessionFactory;
	}

	public List<Member> selectList(int pageNo, int pageSize) throws Exception {
			SqlSession sqlSession = sqlSessionFactory.openSession();
			try {	
			HashMap<String, Object> valueMap = new HashMap<>();
			valueMap.put("startIndex", (pageNo - 1) * pageSize);
			valueMap.put("pageSize", pageSize);
			
			return sqlSession.selectList("step28.ex2.MemberDao.selectList", valueMap);
			
			} finally { 
	     sqlSession.close();
	    }		
	}
	
	public List<Member> selectListByEmail(int pageNo, int pageSize, String email) throws Exception {
			SqlSession sqlSession = sqlSessionFactory.openSession();
			try {	
			HashMap<String, Object> valueMap = new HashMap<>();
			valueMap.put("startIndex", (pageNo - 1) * pageSize);
			valueMap.put("pageSize", pageSize);
			valueMap.put("email", email);
			
			return sqlSession.selectList("step28.ex2.MemberDao.selectListByEmail", valueMap);
			
			} finally { 
	     sqlSession.close();
	    }		
	}
	
	public List<Member> selectListByName(int pageNo, int pageSize, String name) throws Exception {
			SqlSession sqlSession = sqlSessionFactory.openSession();
			try {	
			HashMap<String, Object> valueMap = new HashMap<>();
			valueMap.put("startIndex", (pageNo - 1) * pageSize);
			valueMap.put("pageSize", pageSize);
			valueMap.put("name", name);
			
			return sqlSession.selectList("step28.ex2.MemberDao.selectListByName", valueMap);
			
			} finally { 
	     sqlSession.close();
	    }		
	}
	
	public List<Member> selectListByTel(int pageNo, int pageSize, String tel) throws Exception {
			SqlSession sqlSession = sqlSessionFactory.openSession();
			try {	
			HashMap<String, Object> valueMap = new HashMap<>();
			valueMap.put("startIndex", (pageNo - 1) * pageSize);
			valueMap.put("pageSize", pageSize);
			valueMap.put("tel", tel);
			
			return sqlSession.selectList("step28.ex2.MemberDao.selectListByTel", valueMap);
			
			} finally { 
	     sqlSession.close();
	    }		
	}
	
  public Member selectOne(int no) throws Exception {
  	SqlSession sqlSession = sqlSessionFactory.openSession();
		
  	try {		
			return sqlSession.selectOne("step28.ex2.MemberDao.selectOne", no);
			
		} finally { 
     sqlSession.close();
    }	
  	
  }

  public Member selectOneByEmailPassword(String email, String password) throws Exception {
		SqlSession sqlSession = sqlSessionFactory.openSession();
				
	  try {
	  		HashMap<String,Object> valueMap = new HashMap<>();
	  		valueMap.put("email", email);
	  		valueMap.put("password", password);
				return sqlSession.selectOne("step28.ex2.MemberDao.selectByEmailPassword", valueMap);
			
		} finally { 
     sqlSession.close();
    }	
	
  }
  
  public int insert(Member member) throws Exception {
  	SqlSession sqlSession = sqlSessionFactory.openSession();
		
	  try {  	
			int count = sqlSession.insert("step28.ex2.MemberDao.insert", member);
		
			sqlSession.commit();
			
			return count;
							
		} finally { 
     sqlSession.close();
    }	
	
  }
  
  
  public int update(Member member) throws Exception {
		SqlSession sqlSession = sqlSessionFactory.openSession();
				
		  try {  	
				int count = sqlSession.update("step28.ex2.MemberDao.update", member);
			
				sqlSession.commit();
				
				return count;
								
			} finally { 
	     sqlSession.close();
	    }	
  	
  }
  
  public int delete(int no) throws Exception {
  	SqlSession sqlSession = sqlSessionFactory.openSession();
		
	  try {  	
			int count = sqlSession.delete("step28.ex2.MemberDao.delete", no);
		
			sqlSession.commit();
			
			return count;
							
		} finally { 
     sqlSession.close();
    }	
  	
  }

  
}

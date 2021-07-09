package repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import model.GoodsDTO;

public class GoodsRepository {
	@Autowired
	SqlSession sqlSession;
	String namespace = "mappers.goodsMapper";
	String statement;
	public List<GoodsDTO> goodsList(){ // 괄호 안에 넣은 것이 없으면 = statement만 존재
		statement = namespace + ".goodsList";
		return sqlSession.selectList(statement);
	}
	public void goodsInsert(GoodsDTO dto) { // 괄호 안에 넣어준 것 = parameter
		statement = namespace + ".goodsInsert";
		sqlSession.insert(statement, dto);
	}
	public int goodsNum() {
		statement = namespace + ".goodsNum";
		return sqlSession.selectOne(statement);
	}
}

package com.example.test_dgb.repository;

import com.example.test_dgb.model.entities.Category;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface CategoryRepository {

    @Select("SELECT c.id, c.name " +
            "FROM categories bc " +
            "INNER JOIN categories c ON c.id = bc.category_id " +
            "WHERE bc.book_id = #{bookId};")
    List<Category> getAllCategory();
}

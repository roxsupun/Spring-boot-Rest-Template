package com.concretepage.entity.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.concretepage.entity.Article;
import org.springframework.jdbc.core.RowMapper;

public class ArticleRowMapper implements RowMapper<Article> {

	@Override
	public Article mapRow(ResultSet row, int rowNum) throws SQLException {
		Article article = new Article();
		article.setArticleId(row.getInt("articleId"));
		article.setTitle(row.getString("title"));
		article.setCategory(row.getString("category"));
		return article;
	}

}

package jp.ac.it_college.std.s21021.news_manager.domain.repository

import jp.ac.it_college.std.s21021.news_manager.domain.model.News
import jp.ac.it_college.std.s21021.news_manager.domain.model.NewsWithCategory

interface NewsRepository {
    fun findAllWihCategory(): List<NewsWithCategory>

    fun findWithCategory(id: Long): NewsWithCategory?

    fun register(news: News)

}
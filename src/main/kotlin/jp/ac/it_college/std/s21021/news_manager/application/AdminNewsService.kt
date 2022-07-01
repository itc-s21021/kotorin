package jp.ac.it_college.std.s21021.news_manager.application

import jp.ac.it_college.std.s21021.news_manager.domain.model.News
import jp.ac.it_college.std.s21021.news_manager.domain.repository.NewsRepository
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class AdminNewsService (
    private val newsRepository: NewsRepository
) {
    @Transactional
    fun register(news: News) {
        newsRepository.findWithCategory(news.id)?.let {
            throw IllegalArgumentException("すでに存在するID: ${news.id}")
        }
        newsRepository.register(news)
    }
}
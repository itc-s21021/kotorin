package jp.ac.it_college.std.s21021.news_manager.application


import jp.ac.it_college.std.s21021.news_manager.domain.model.NewsWithCategory
import jp.ac.it_college.std.s21021.news_manager.domain.repository.NewsRepository
import org.springframework.stereotype.Service

@Service
class NewsService (
    private val newsRepository: NewsRepository
) {
    fun getList(): List<NewsWithCategory> {
        return newsRepository.findAllWihCategory()
    }

    fun getDetail(newsId: Long): NewsWithCategory {
        return newsRepository.findWithCategory(newsId) ?: throw IllegalArgumentException("存在しないID: $newsId")
    }
}
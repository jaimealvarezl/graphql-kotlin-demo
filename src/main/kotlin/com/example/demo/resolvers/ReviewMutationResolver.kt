package com.example.demo.resolvers

import com.coxautodev.graphql.tools.GraphQLMutationResolver
import com.example.demo.entity.Review
import com.example.demo.repository.ReviewRepository
import org.springframework.stereotype.Component

@Component
class ReviewMutationResolver(private val reviewRepository: ReviewRepository) : GraphQLMutationResolver {
    fun newReview(snackId: String, rating: Int, text: String): Review {
        val review = Review(snackId, rating, text);
        reviewRepository.save(review);
        return review
    }
}

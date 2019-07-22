package com.onlineAcademy.service.RESTservice.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.onlineAcademy.service.RESTservice.database.DatabaseClass;
import com.onlineAcademy.service.RESTservice.model.Course;
import com.onlineAcademy.service.RESTservice.model.Review;

public class ReviewService {
	
	//private Map<Long, Course> courses = DatabaseClass.getCourses();
	private CourseService courseService = new CourseService();
	
	public List<Review> getAllReviews(long courseId, long reviewId) {
		Map<Long, Review> reviews = courseService.getCoursesMap().get(courseId).getReviews();
		return new ArrayList<Review>(reviews.values());
	}
	
	public Review getReview(long courseId, long reviewId) {
        Map<Long, Review> reviews = courseService.getCoursesMap().get(courseId).getReviews();
        return reviews.get(reviewId);
	}
	
	public Review addReview(long courseId, Review review) {
		Map<Long, Review> reviews = courseService.getCoursesMap().get(courseId).getReviews();
		review.setId(reviews.size() + 1);
		reviews.put(review.getId(), review);
		return review;
	}
	
	public Review updateReview(long courseId, Review review) {
		Map<Long, Review> reviews = courseService.getCoursesMap().get(courseId).getReviews();
		if (review.getId() <= 0) {
			return null;
		}
		reviews.put(review.getId(), review);
		return review;
	}
	
	public Review deleteReview(long courseId, long reviewId) {
		Map<Long, Review> reviews = courseService.getCoursesMap().get(courseId).getReviews();
		return reviews.remove(courseId);
	}

}

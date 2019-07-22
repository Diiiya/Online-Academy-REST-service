package com.onlineAcademy.service.RESTservice.resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.onlineAcademy.service.RESTservice.model.Review;
import com.onlineAcademy.service.RESTservice.service.ReviewService;

@Path("/")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)

public class ReviewResource {

	private ReviewService reviewService = new ReviewService();
	
	@GET
	public List<Review> getAll(@PathParam("courseId") long courseId, @PathParam("reviewId") long reviewId) {
		return reviewService.getAllReviews(courseId, reviewId);
	}
	
	@GET
	@Path("/{reviewId}")
	public Review getReview(@PathParam("courseId") long courseId, @PathParam("reviewId") long reviewId) {
		return reviewService.getReview(courseId, reviewId);
	}
	
	
}

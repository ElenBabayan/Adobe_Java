package twitterapp.com.service.tweet;

import twitterapp.com.entity.Tweet;

public interface TweetService {
    Tweet create(TweetCreateParams tweetCreateParams);

}

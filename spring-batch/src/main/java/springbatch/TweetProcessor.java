package springbatch;

import org.springframework.batch.item.ItemProcessor;

import common.Tweet;

/**
 * Spring Batch tweet processor.
 */
public class TweetProcessor implements ItemProcessor<Tweet, Tweet> {

    @Override
    public Tweet process(Tweet tweet) throws Exception {
        tweet.setMessage(tweet.getMessage().toUpperCase());
        return tweet;
    }

}
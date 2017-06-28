package org.codingpedia.demo.rest.dao;

import org.codingpedia.demo.rest.JPAEntity.PodcastEntity;
import org.codingpedia.demo.rest.JPAEntity.boardEntity;
import org.codingpedia.demo.rest.JPAEntity.boardEntity3;

import java.util.List;

/**
 * 
 * @author ama
 * @see <a href="http://www.codingpedia.org/ama/spring-mybatis-integration-example/">http://www.codingpedia.org/ama/spring-mybatis-integration-example/</a>
 */
public interface PodcastDao {
	public List<boardEntity> getPodcasts1(String orderByInsertionDate);

	public List<boardEntity3> getPodcasts123(String param1, String param2, String param3);
	
	public List<PodcastEntity> getPodcasts(String orderByInsertionDate);

	public List<PodcastEntity> getRecentPodcasts(int numberOfDaysToLookBack);
	
	/**
	 * Returns a podcast given its id
	 * 
	 * @param id
	 * @return
	 */
	public PodcastEntity getPodcastById(Long id);
	
	/**
	 * Find podcast by feed
	 * 
	 * @param feed
	 * @return the podcast with the feed specified feed or null if not existent 
	 */
	public PodcastEntity getPodcastByFeed(String feed);	

	public void deletePodcastById(Long id);

	public Long createPodcast(PodcastEntity podcast);

	public void updatePodcast(PodcastEntity podcast);

	/** removes all podcasts */
	public void deletePodcasts();

	/** 
	 * Returns all podcasts from "legacy" system
	 * @return
	 */
	public List<PodcastEntity> getLegacyPodcasts();
	
	/**
	 * Returns a "legacy" podcast given its id
	 * 
	 * @param id
	 * @return
	 */
	public PodcastEntity getLegacyPodcastById(Long id);	

}

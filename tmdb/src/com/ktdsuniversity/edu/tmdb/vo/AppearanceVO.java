package com.ktdsuniversity.edu.tmdb.vo;

/**
 * @TableName APEARANCE
 * @TableComment null
 */
public class AppearanceVO {

	/**
	 * @ColumnName APEARANCE_ID
	 * @ColumnType VARCHAR2(18)
	 * @ColumnComment AP-YYYYMMDD-일련번호(6자리)
	 */
	private String appearanceId;

	/**
	 * @ColumnName MOVIE_ID
	 * @ColumnType VARCHAR2(18)
	 * @ColumnComment MV-YYYYMMDD-일련번호(6자리)
	 */
	private String movieId;

	/**
	 * @ColumnName ACTOR_ID
	 * @ColumnType VARCHAR2(18)
	 * @ColumnComment AC-YYYYMMDD-일련번호(6자리)
	 */
	private String actorId;

	/**
	 * @ColumnName CHARACTER
	 * @ColumnType VARCHAR2(40)
	 * @ColumnComment null
	 */
	private String character;

	private ActorVO actor;

	public ActorVO getActor() {
		return actor;
	}

	public void setActor(ActorVO actor) {
		this.actor = actor;
	}

	public String getAppearanceId() {
		return this.appearanceId;
	}

	public void setAppearanceId(String apearanceId) {
		this.appearanceId = apearanceId;
	}

	public String getMovieId() {
		return this.movieId;
	}

	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}

	public String getActorId() {
		return this.actorId;
	}

	public void setActorId(String actorId) {
		this.actorId = actorId;
	}

	public String getCharacter() {
		return this.character;
	}

	public void setCharacter(String character) {
		this.character = character;
	}

	@Override
	public String toString() {
		return "AppearanceVO [appearanceId=" + this.appearanceId + ", movieId=" + this.movieId + ", actorId="
				+ this.actorId + ", character=" + this.character + ", actor=" + this.actor + "]";
	}

}
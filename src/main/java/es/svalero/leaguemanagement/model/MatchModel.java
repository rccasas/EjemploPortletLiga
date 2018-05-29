package es.svalero.leaguemanagement.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.StagedGroupedModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the Match service. Represents a row in the &quot;LM_Match&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link es.svalero.leaguemanagement.model.impl.MatchModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link es.svalero.leaguemanagement.model.impl.MatchImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Match
 * @see es.svalero.leaguemanagement.model.impl.MatchImpl
 * @see es.svalero.leaguemanagement.model.impl.MatchModelImpl
 * @generated
 */
public interface MatchModel extends BaseModel<Match>, StagedGroupedModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. All methods that expect a match model instance should use the {@link Match} interface instead.
     */

    /**
     * Returns the primary key of this match.
     *
     * @return the primary key of this match
     */
    public long getPrimaryKey();

    /**
     * Sets the primary key of this match.
     *
     * @param primaryKey the primary key of this match
     */
    public void setPrimaryKey(long primaryKey);

    /**
     * Returns the uuid of this match.
     *
     * @return the uuid of this match
     */
    @AutoEscape
    @Override
    public String getUuid();

    /**
     * Sets the uuid of this match.
     *
     * @param uuid the uuid of this match
     */
    @Override
    public void setUuid(String uuid);

    /**
     * Returns the match ID of this match.
     *
     * @return the match ID of this match
     */
    public long getMatchId();

    /**
     * Sets the match ID of this match.
     *
     * @param matchId the match ID of this match
     */
    public void setMatchId(long matchId);

    /**
     * Returns the group ID of this match.
     *
     * @return the group ID of this match
     */
    @Override
    public long getGroupId();

    /**
     * Sets the group ID of this match.
     *
     * @param groupId the group ID of this match
     */
    @Override
    public void setGroupId(long groupId);

    /**
     * Returns the company ID of this match.
     *
     * @return the company ID of this match
     */
    @Override
    public long getCompanyId();

    /**
     * Sets the company ID of this match.
     *
     * @param companyId the company ID of this match
     */
    @Override
    public void setCompanyId(long companyId);

    /**
     * Returns the user ID of this match.
     *
     * @return the user ID of this match
     */
    @Override
    public long getUserId();

    /**
     * Sets the user ID of this match.
     *
     * @param userId the user ID of this match
     */
    @Override
    public void setUserId(long userId);

    /**
     * Returns the user uuid of this match.
     *
     * @return the user uuid of this match
     * @throws SystemException if a system exception occurred
     */
    @Override
    public String getUserUuid() throws SystemException;

    /**
     * Sets the user uuid of this match.
     *
     * @param userUuid the user uuid of this match
     */
    @Override
    public void setUserUuid(String userUuid);

    /**
     * Returns the user name of this match.
     *
     * @return the user name of this match
     */
    @AutoEscape
    @Override
    public String getUserName();

    /**
     * Sets the user name of this match.
     *
     * @param userName the user name of this match
     */
    @Override
    public void setUserName(String userName);

    /**
     * Returns the create date of this match.
     *
     * @return the create date of this match
     */
    @Override
    public Date getCreateDate();

    /**
     * Sets the create date of this match.
     *
     * @param createDate the create date of this match
     */
    @Override
    public void setCreateDate(Date createDate);

    /**
     * Returns the modified date of this match.
     *
     * @return the modified date of this match
     */
    @Override
    public Date getModifiedDate();

    /**
     * Sets the modified date of this match.
     *
     * @param modifiedDate the modified date of this match
     */
    @Override
    public void setModifiedDate(Date modifiedDate);

    /**
     * Returns the local team ID of this match.
     *
     * @return the local team ID of this match
     */
    public long getLocalTeamId();

    /**
     * Sets the local team ID of this match.
     *
     * @param localTeamId the local team ID of this match
     */
    public void setLocalTeamId(long localTeamId);

    /**
     * Returns the visiting team ID of this match.
     *
     * @return the visiting team ID of this match
     */
    public long getVisitingTeamId();

    /**
     * Sets the visiting team ID of this match.
     *
     * @param visitingTeamId the visiting team ID of this match
     */
    public void setVisitingTeamId(long visitingTeamId);

    /**
     * Returns the local score of this match.
     *
     * @return the local score of this match
     */
    public int getLocalScore();

    /**
     * Sets the local score of this match.
     *
     * @param localScore the local score of this match
     */
    public void setLocalScore(int localScore);

    /**
     * Returns the visiting score of this match.
     *
     * @return the visiting score of this match
     */
    public int getVisitingScore();

    /**
     * Sets the visiting score of this match.
     *
     * @param visitingScore the visiting score of this match
     */
    public void setVisitingScore(int visitingScore);

    @Override
    public boolean isNew();

    @Override
    public void setNew(boolean n);

    @Override
    public boolean isCachedModel();

    @Override
    public void setCachedModel(boolean cachedModel);

    @Override
    public boolean isEscapedModel();

    @Override
    public Serializable getPrimaryKeyObj();

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj);

    @Override
    public ExpandoBridge getExpandoBridge();

    @Override
    public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

    @Override
    public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

    @Override
    public void setExpandoBridgeAttributes(ServiceContext serviceContext);

    @Override
    public Object clone();

    @Override
    public int compareTo(es.svalero.leaguemanagement.model.Match match);

    @Override
    public int hashCode();

    @Override
    public CacheModel<es.svalero.leaguemanagement.model.Match> toCacheModel();

    @Override
    public es.svalero.leaguemanagement.model.Match toEscapedModel();

    @Override
    public es.svalero.leaguemanagement.model.Match toUnescapedModel();

    @Override
    public String toString();

    @Override
    public String toXmlString();
}
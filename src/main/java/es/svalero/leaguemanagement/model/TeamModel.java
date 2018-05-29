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
 * The base model interface for the Team service. Represents a row in the &quot;LM_Team&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link es.svalero.leaguemanagement.model.impl.TeamModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link es.svalero.leaguemanagement.model.impl.TeamImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Team
 * @see es.svalero.leaguemanagement.model.impl.TeamImpl
 * @see es.svalero.leaguemanagement.model.impl.TeamModelImpl
 * @generated
 */
public interface TeamModel extends BaseModel<Team>, StagedGroupedModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. All methods that expect a team model instance should use the {@link Team} interface instead.
     */

    /**
     * Returns the primary key of this team.
     *
     * @return the primary key of this team
     */
    public long getPrimaryKey();

    /**
     * Sets the primary key of this team.
     *
     * @param primaryKey the primary key of this team
     */
    public void setPrimaryKey(long primaryKey);

    /**
     * Returns the uuid of this team.
     *
     * @return the uuid of this team
     */
    @AutoEscape
    @Override
    public String getUuid();

    /**
     * Sets the uuid of this team.
     *
     * @param uuid the uuid of this team
     */
    @Override
    public void setUuid(String uuid);

    /**
     * Returns the team ID of this team.
     *
     * @return the team ID of this team
     */
    public long getTeamId();

    /**
     * Sets the team ID of this team.
     *
     * @param teamId the team ID of this team
     */
    public void setTeamId(long teamId);

    /**
     * Returns the group ID of this team.
     *
     * @return the group ID of this team
     */
    @Override
    public long getGroupId();

    /**
     * Sets the group ID of this team.
     *
     * @param groupId the group ID of this team
     */
    @Override
    public void setGroupId(long groupId);

    /**
     * Returns the company ID of this team.
     *
     * @return the company ID of this team
     */
    @Override
    public long getCompanyId();

    /**
     * Sets the company ID of this team.
     *
     * @param companyId the company ID of this team
     */
    @Override
    public void setCompanyId(long companyId);

    /**
     * Returns the user ID of this team.
     *
     * @return the user ID of this team
     */
    @Override
    public long getUserId();

    /**
     * Sets the user ID of this team.
     *
     * @param userId the user ID of this team
     */
    @Override
    public void setUserId(long userId);

    /**
     * Returns the user uuid of this team.
     *
     * @return the user uuid of this team
     * @throws SystemException if a system exception occurred
     */
    @Override
    public String getUserUuid() throws SystemException;

    /**
     * Sets the user uuid of this team.
     *
     * @param userUuid the user uuid of this team
     */
    @Override
    public void setUserUuid(String userUuid);

    /**
     * Returns the user name of this team.
     *
     * @return the user name of this team
     */
    @AutoEscape
    @Override
    public String getUserName();

    /**
     * Sets the user name of this team.
     *
     * @param userName the user name of this team
     */
    @Override
    public void setUserName(String userName);

    /**
     * Returns the create date of this team.
     *
     * @return the create date of this team
     */
    @Override
    public Date getCreateDate();

    /**
     * Sets the create date of this team.
     *
     * @param createDate the create date of this team
     */
    @Override
    public void setCreateDate(Date createDate);

    /**
     * Returns the modified date of this team.
     *
     * @return the modified date of this team
     */
    @Override
    public Date getModifiedDate();

    /**
     * Sets the modified date of this team.
     *
     * @param modifiedDate the modified date of this team
     */
    @Override
    public void setModifiedDate(Date modifiedDate);

    /**
     * Returns the league ID of this team.
     *
     * @return the league ID of this team
     */
    public long getLeagueId();

    /**
     * Sets the league ID of this team.
     *
     * @param leagueId the league ID of this team
     */
    public void setLeagueId(long leagueId);

    /**
     * Returns the name of this team.
     *
     * @return the name of this team
     */
    @AutoEscape
    public String getName();

    /**
     * Sets the name of this team.
     *
     * @param name the name of this team
     */
    public void setName(String name);

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
    public int compareTo(es.svalero.leaguemanagement.model.Team team);

    @Override
    public int hashCode();

    @Override
    public CacheModel<es.svalero.leaguemanagement.model.Team> toCacheModel();

    @Override
    public es.svalero.leaguemanagement.model.Team toEscapedModel();

    @Override
    public es.svalero.leaguemanagement.model.Team toUnescapedModel();

    @Override
    public String toString();

    @Override
    public String toXmlString();
}

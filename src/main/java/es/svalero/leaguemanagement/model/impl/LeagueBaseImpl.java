package es.svalero.leaguemanagement.model.impl;

import com.liferay.portal.kernel.exception.SystemException;

import es.svalero.leaguemanagement.model.League;
import es.svalero.leaguemanagement.service.LeagueLocalServiceUtil;

/**
 * The extended model base implementation for the League service. Represents a row in the &quot;LM_League&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link LeagueImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see LeagueImpl
 * @see es.svalero.leaguemanagement.model.League
 * @generated
 */
public abstract class LeagueBaseImpl extends LeagueModelImpl implements League {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a league model instance should use the {@link League} interface instead.
     */
    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            LeagueLocalServiceUtil.addLeague(this);
        } else {
            LeagueLocalServiceUtil.updateLeague(this);
        }
    }
}
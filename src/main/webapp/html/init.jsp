<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="theme" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ page import="java.util.List" %>
<%@ page import="com.liferay.portal.kernel.util.ParamUtil" %>
<%@ page import="com.liferay.portal.kernel.util.HtmlUtil" %>
<%@ page import="com.liferay.portal.kernel.util.StringPool" %>

<%@ page import="com.liferay.portal.kernel.dao.search.SearchEntry" %>
<%@ page import="com.liferay.portal.kernel.dao.search.ResultRow" %>
<%@ page import="com.liferay.portal.security.permission.ActionKeys" %>

<%@ page import="es.svalero.leaguemanagement.model.League" %>
<%@ page import="es.svalero.leaguemanagement.model.LeagueDay" %>
<%@ page import="es.svalero.leaguemanagement.service.LeagueLocalServiceUtil" %>
<%@ page import="es.svalero.leaguemanagement.service.TeamLocalServiceUtil" %>
<%@ page import="es.svalero.leaguemanagement.service.LeagueDayLocalServiceUtil" %>
<%@ page import="es.svalero.leaguemanagement.util.LeagueManagementWebKeys" %>

<portlet:defineObjects />
<theme:defineObjects />
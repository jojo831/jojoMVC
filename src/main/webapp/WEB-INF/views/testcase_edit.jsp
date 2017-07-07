<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="head.jsp" %>

<%--
  Created by IntelliJ IDEA.
  User: mason
  Date: 2017/5/31
  Time: 13:53
  To change this template use File | Settings | File Templates.
--%>
<html>
<head>
    <%--<base href="<%=basePath%>">--%>
    <title>Title</title>
</head>
<body>
<form id="form1" name="form1" method="get" action="<%=basePath%>info/showMsg">
    <p>
        <label for="TRADE_CO">TRADE_CO：</label>
        <input type="text" name="TRADE_CO" id="TRADE_CO" value="3117980058">
    </p>
    <p>
        <label for="DECL_DATE">DECL_DATE：</label>
        <input type="text" name="DECL_DATE" id="DECL_DATE" value="20170601">-
        <input type="text" id="DECL_DATE1" value="20170801" >
    </p>
    <p>
        <label for="CREATE_TIME">CREATE_TIME：</label>
        <input type="text" name="CREATE_TIME" id="CREATE_TIME" value="20170601000000">-
        <input type="text" id="CREATE_TIME1" value="20170801000000">
    </p>
    <p>
        <label for="PROCESS_STATUS">PROCESS_STATUS：</label>
        <select id="PROCESS_STATUS">
            <option value="pass">已通过</option>
            <option value="np">未通过</option>
        </select>
    </p>
    <p>
        <label for="TRAF_NAME">TRAF_NAME：</label>
        <input type="text" name="TRAF_NAME" id="TRAF_NAME" value="%KMTC%">
    </p>
    <p>
        <label for="VOYAGE">VOYAGE：</label>
        <input type="text" name="VOYAGE" id="VOYAGE" value="%1%">
    </p>
    <p>
        <label for="EXP_IMP">EXP_IMP：</label>
        <input type="text" name="EXP_IMP" id="EXP_IMP" value="E">
    </p>
    <p>
        <label for="SUB_CUS">SUB_CUS：</label>
        <input type="text" name="SUB_CUS" id="SUB_CUS" value="2229">
    </p>
    <p>
        <label for="TRADE_MODE">SUB_CUS：</label>
        <input type="text" name="TRADE_MODE" id="TRADE_MODE" value="0110">
    </p>
    <p>
        <textarea name="textfield6" id="textfield6" cols="50" rows="50">
            SELECT
T.ENTRY_ID_NEW AS ENTRY_ID_NEW,
T.PROCESS_STATUS AS PROCESS_STATUS,
TO_CHAR (T.CREATE_TIME, 'YYYY/MM/DD HH24:MI:SS') AS CREATE_TIME,
T.BILL_NO AS BILL_NO,
(T.TRAF_NAME || '/' || T.VOYAGE) AS TRAF_NAME,
T.EXP_IMP AS EXP_IMP_CODE,
T.EXP_IMP AS EXP_IMP,
T.SUB_CUS AS SUB_CUS_CODE,
TO_CHAR (T.COL_DATE, 'YYYY/MM/DD HH24:MI:SS') COL_DATE,
TO_CHAR (T.DECL_DATE, 'YYYY/MM/DD') DECL_DATE,
T.TRADE_MODE AS TRADE_MODE_CODE,
T.DECL_CO AS DECL_CODE,
T.DECL_NAME AS DECL_NAME,
T.TRADE_CO AS TRADE_CODE,
T.TRADE_NAME AS TRADE_NAME
FROM
ODI_SRC.EDI_MONITOR T
WHERE T.DECL_CO = '3117980058'
AND T.DECL_DATE >= TO_DATE ('20170601', 'YYYYMMDD')
AND T.DECL_DATE <= TO_DATE ('20170801', 'YYYYMMDD')
AND T.CREATE_TIME >= TO_DATE ('20170601000000', 'YYYYMMDDHH24MISS')
AND T.CREATE_TIME <= TO_DATE ('20170801000000', 'YYYYMMDDHH24MISS')
AND T.PROCESS_STATUS = '已通过'
AND T.TRAF_NAME LIKE '%KMTC%'
AND T.VOYAGE LIKE '%1%'
AND T.EXP_IMP = 'E'
AND T.SUB_CUS = '2229'
AND T.TRADE_MODE = '0110'
UNION ALL
SELECT
T.ENTRY_ID_NEW AS ENTRY_ID_NEW,
T.PROCESS_STATUS AS PROCESS_STATUS,
TO_CHAR (T.CREATE_TIME, 'YYYY/MM/DD HH24:MI:SS') AS CREATE_TIME,
T.BILL_NO AS BILL_NO,
(T.TRAF_NAME || '/' || T.VOYAGE) AS TRAF_NAME,
T.EXP_IMP AS EXP_IMP_CODE,
T.EXP_IMP AS EXP_IMP,
T.SUB_CUS AS SUB_CUS_CODE,
TO_CHAR (T.COL_DATE, 'YYYY/MM/DD HH24:MI:SS') COL_DATE,
TO_CHAR (T.DECL_DATE, 'YYYY/MM/DD') DECL_DATE,
T.TRADE_MODE AS TRADE_MODE_CODE,
T.DECL_CO AS DECL_CODE,
T.DECL_NAME AS DECL_NAME,
T.TRADE_CO AS TRADE_CODE,
T.TRADE_NAME AS TRADE_NAME
FROM
ODI_SRC.EDI_MONITOR T
WHERE T.TRADE_CO = '3117980058'
AND T.DECL_DATE >= TO_DATE ('20170601', 'YYYYMMDD')
AND T.DECL_DATE <= TO_DATE ('20170801', 'YYYYMMDD')
AND T.CREATE_TIME >= TO_DATE ('20170601000000', 'YYYYMMDDHH24MISS')
AND T.CREATE_TIME <= TO_DATE ('20170801000000', 'YYYYMMDDHH24MISS')
AND T.PROCESS_STATUS = '已通过'
AND T.TRAF_NAME LIKE '%KMTC%'
AND T.VOYAGE LIKE '%1%'
AND T.EXP_IMP = 'E'
AND T.SUB_CUS = '2229'
AND T.TRADE_MODE = '0110'
</textarea>
        <br><input type="submit" name="button" id="button" value="提交/保存">
        <input type="button" name="button1" id="button1" value="查看列表">
    </p><input type="hidden" name="token" value="${token}" />
</form>
</body>
</html>
<script>


</script>
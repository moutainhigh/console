package com.allcheer.bpos.entity;

public class TblOnlineUserMapDO {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TBL_ONLINE_USER_MAP.USR_NAME
     *
     * @mbggenerated
     */
    private String usrName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TBL_ONLINE_USER_MAP.MER_ID
     *
     * @mbggenerated
     */
    private String merId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TBL_ONLINE_USER_MAP.CARD_UP
     *
     * @mbggenerated
     */
    private String cardUp;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TBL_ONLINE_USER_MAP.CARD_DOWN
     *
     * @mbggenerated
     */
    private String cardDown;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TBL_ONLINE_USER_MAP.USR_NAME
     *
     * @return the value of TBL_ONLINE_USER_MAP.USR_NAME
     *
     * @mbggenerated
     */
    public String getUsrName() {
        return usrName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TBL_ONLINE_USER_MAP.USR_NAME
     *
     * @param usrName the value for TBL_ONLINE_USER_MAP.USR_NAME
     *
     * @mbggenerated
     */
    public void setUsrName(String usrName) {
        this.usrName = usrName == null ? null : usrName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TBL_ONLINE_USER_MAP.MER_ID
     *
     * @return the value of TBL_ONLINE_USER_MAP.MER_ID
     *
     * @mbggenerated
     */
    public String getMerId() {
        return merId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TBL_ONLINE_USER_MAP.MER_ID
     *
     * @param merId the value for TBL_ONLINE_USER_MAP.MER_ID
     *
     * @mbggenerated
     */
    public void setMerId(String merId) {
        this.merId = merId == null ? null : merId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TBL_ONLINE_USER_MAP.CARD_UP
     *
     * @return the value of TBL_ONLINE_USER_MAP.CARD_UP
     *
     * @mbggenerated
     */
    public String getCardUp() {
        return cardUp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TBL_ONLINE_USER_MAP.CARD_UP
     *
     * @param cardUp the value for TBL_ONLINE_USER_MAP.CARD_UP
     *
     * @mbggenerated
     */
    public void setCardUp(String cardUp) {
        this.cardUp = cardUp == null ? null : cardUp.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TBL_ONLINE_USER_MAP.CARD_DOWN
     *
     * @return the value of TBL_ONLINE_USER_MAP.CARD_DOWN
     *
     * @mbggenerated
     */
    public String getCardDown() {
        return cardDown;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TBL_ONLINE_USER_MAP.CARD_DOWN
     *
     * @param cardDown the value for TBL_ONLINE_USER_MAP.CARD_DOWN
     *
     * @mbggenerated
     */
    public void setCardDown(String cardDown) {
        this.cardDown = cardDown == null ? null : cardDown.trim();
    }
}
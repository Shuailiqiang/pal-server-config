package palworldconfig.model;

import java.math.BigDecimal;

public class PalWorldSettings {
	private String Difficulty; // =None,    ; 难度None或Difficulty
	private BigDecimal DayTimeSpeedRate; // =1.000000,  ; 白天流逝速度
	private BigDecimal NightTimeSpeedRate; // =1.000000,    ; 夜晚流逝速度
	private BigDecimal ExpRate; // =1.000000,   ; 经验值倍率
	private BigDecimal PalCaptureRate; // =1.000000,    ; 捕捉概率倍率
	private BigDecimal PalSpawnNumRate; // =1.000000,   ; 帕鲁出现数量倍率
	private BigDecimal PalDamageRateAttack; // =1.000000,   ; 帕鲁攻击伤害倍率
	private BigDecimal PalDamageRateDefense; // =1.000000,  ; 帕鲁承受伤害倍率
	private BigDecimal PlayerDamageRateAttack; // =1.000000,    ; 玩家攻击伤害倍率
	private BigDecimal PlayerDamageRateDefense; // =1.000000,   ; 玩家承受伤害倍率
	private BigDecimal PlayerStomachDecreaceRate; // =1.000000, ; 玩家饱食度降低倍率
	private BigDecimal PlayerStaminaDecreaceRate; // =1.000000, ; 玩家耐力倍率
	private BigDecimal PlayerAutoHPRegeneRate; // =1.000000,    ; 玩家生命值恢复倍率
	private BigDecimal PlayerAutoHpRegeneRateInSleep; // =1.000000, ; 玩家睡眠时生命恢复倍率
	private BigDecimal PalStomachDecreaceRate; // =1.000000,    ; 帕鲁饱食度降低倍率
	private BigDecimal PalStaminaDecreaceRate; // =1.000000,    ; 帕鲁耐力降低倍率
	private BigDecimal PalAutoHPRegeneRate; // =1.000000,   ; 帕鲁生命值自然恢复倍率
	private BigDecimal PalAutoHpRegeneRateInSleep; // =1.000000,    ; 帕鲁睡眠时生命恢复倍率
	private BigDecimal BuildObjectDamageRate; // =1.000000, ; 对建筑物伤害倍率
	private BigDecimal BuildObjectDeteriorationDamageRate; // =1.000000,    ; 建筑物劣化速度倍率
	private BigDecimal CollectionDropRate; // =1.000000,    ; 可采集物品掉落倍率
	private BigDecimal CollectionObjectHpRate; // =1.000000,    ; 可采集物品生命值倍率
	private BigDecimal CollectionObjectRespawnSpeedRate; // =1.000000,  ; 可采集物品生成速率
	private BigDecimal EnemyDropItemRate; // =1.000000, ; 敌方掉落物品率
	private String DeathPenalty; // =All,   ; 死亡惩罚None不掉落Item只掉物品不掉装备ItemAndEquipment掉物品和装备All全都掉
	private Boolean bEnablePlayerToPlayerDamage; // =False,  ; 启用玩家对玩家伤害功能
	private Boolean bEnableFriendlyFire; // =False,  ; 火焰伤害
	private Boolean bEnableInvaderEnemy; // =True,   ; 否会发生袭击事件
	private Boolean bActiveUNKO; // =False,  ; ？？
	private Boolean bEnableAimAssistPad; // =True,   ; 启用瞄准辅助手柄
	private Boolean bEnableAimAssistKeyboard; // =False, ; 准星开启
	private Integer DropItemMaxNum; // =3000,    ; 掉落物品最大数量
	private Integer DropItemMaxNum_UNKO; // =100,    ; 掉落物品最大数量_UNKO
	private Integer BaseCampMaxNum; // =128, ; 大本营最大数
	private Integer BaseCampWorkerMaxNum; // =15,    ; 大本营工人最多人数
	private BigDecimal DropItemAliveMaxHours; // =1.000000, ; 掉落物品存在最大时长
	private Boolean bAutoResetGuildNoOnlinePlayers; // =False,   ; 自动重置没有在线玩家的公会
	private BigDecimal AutoResetGuildTimeNoOnlinePlayers; // =72.000000,    ; 无在线玩家时自动重置生成时间
	private Integer GuildPlayerMaxNum = 20; // ,;公会玩家最大数量
	private BigDecimal PalEggDefaultHatchingTime; // =72.000000,    ; 帕鲁蛋默认孵化时间
	private BigDecimal WorkSpeedRate; // =1.000000, ; 工作速率
	private Boolean bIsMultiplay; // =False, ; 多人游戏
	private Boolean bIsPvP; // =False,   ; PvP
	private Boolean bCanPickupOtherGuildDeathPenaltyDrop; // =False, ; 可拾取其他公会的死亡掉落物
	private Boolean bEnableNonLoginPenalty; // =True,    ; 启用不登录惩罚
	private Boolean bEnableFastTravel; // =True, ; 启用快速旅行
	private Boolean bIsStartLocationSelectByMap; // =True,   ; 通过地图选择起始位置
	private Boolean bExistPlayerAfterLogout; // =False,  ; 注销后玩家仍然存在
	private Boolean bEnableDefenseOtherGuildPlayer; // =False,   ; 启用防御其他公会玩家功能
	private Integer CoopPlayerMaxNum = 4; // ,; 合作玩家最大人数
	private Integer ServerPlayerMaxNum; //  = 32,;服务器玩家最大人数
	private String ServerName; // ="Default Palworld Server",   ; 服务器名称
	private String ServerDescription; // ="",   ; 服务器描述
	private String AdminPassword; // ="",   ; 管理员密码
	private String ServerPassword; // ="",  ; 服务器密码
	private Integer PublicPort; //服务器端口  = 8211
	private String PublicIP; // ="",    ; 服务器ip
	private Boolean RCONEnabled; // =False,  ; 启用 RCON
	private Integer RCONPort; // =25575, ; RCON端口
	private String Region; // ="",  ; 地区
	private Boolean bUseAuth; // =True,  ; 使用授权
	private String BanListURL; // ="https://api.palworldgame.com/api/banlist.txt")  ; 封禁用户URL

	public String getDifficulty() {
		return Difficulty;
	}

	public void setDifficulty(String difficulty) {
		Difficulty = difficulty;
	}

	public BigDecimal getDayTimeSpeedRate() {
		return DayTimeSpeedRate;
	}

	public void setDayTimeSpeedRate(BigDecimal dayTimeSpeedRate) {
		DayTimeSpeedRate = dayTimeSpeedRate;
	}

	public BigDecimal getNightTimeSpeedRate() {
		return NightTimeSpeedRate;
	}

	public void setNightTimeSpeedRate(BigDecimal nightTimeSpeedRate) {
		NightTimeSpeedRate = nightTimeSpeedRate;
	}

	public BigDecimal getExpRate() {
		return ExpRate;
	}

	public void setExpRate(BigDecimal expRate) {
		ExpRate = expRate;
	}

	public BigDecimal getPalCaptureRate() {
		return PalCaptureRate;
	}

	public void setPalCaptureRate(BigDecimal palCaptureRate) {
		PalCaptureRate = palCaptureRate;
	}

	public BigDecimal getPalSpawnNumRate() {
		return PalSpawnNumRate;
	}

	public void setPalSpawnNumRate(BigDecimal palSpawnNumRate) {
		PalSpawnNumRate = palSpawnNumRate;
	}

	public BigDecimal getPalDamageRateAttack() {
		return PalDamageRateAttack;
	}

	public void setPalDamageRateAttack(BigDecimal palDamageRateAttack) {
		PalDamageRateAttack = palDamageRateAttack;
	}

	public BigDecimal getPalDamageRateDefense() {
		return PalDamageRateDefense;
	}

	public void setPalDamageRateDefense(BigDecimal palDamageRateDefense) {
		PalDamageRateDefense = palDamageRateDefense;
	}

	public BigDecimal getPlayerDamageRateAttack() {
		return PlayerDamageRateAttack;
	}

	public void setPlayerDamageRateAttack(BigDecimal playerDamageRateAttack) {
		PlayerDamageRateAttack = playerDamageRateAttack;
	}

	public BigDecimal getPlayerDamageRateDefense() {
		return PlayerDamageRateDefense;
	}

	public void setPlayerDamageRateDefense(BigDecimal playerDamageRateDefense) {
		PlayerDamageRateDefense = playerDamageRateDefense;
	}

	public BigDecimal getPlayerStomachDecreaceRate() {
		return PlayerStomachDecreaceRate;
	}

	public void setPlayerStomachDecreaceRate(BigDecimal playerStomachDecreaceRate) {
		PlayerStomachDecreaceRate = playerStomachDecreaceRate;
	}

	public BigDecimal getPlayerStaminaDecreaceRate() {
		return PlayerStaminaDecreaceRate;
	}

	public void setPlayerStaminaDecreaceRate(BigDecimal playerStaminaDecreaceRate) {
		PlayerStaminaDecreaceRate = playerStaminaDecreaceRate;
	}

	public BigDecimal getPlayerAutoHPRegeneRate() {
		return PlayerAutoHPRegeneRate;
	}

	public void setPlayerAutoHPRegeneRate(BigDecimal playerAutoHPRegeneRate) {
		PlayerAutoHPRegeneRate = playerAutoHPRegeneRate;
	}

	public BigDecimal getPlayerAutoHpRegeneRateInSleep() {
		return PlayerAutoHpRegeneRateInSleep;
	}

	public void setPlayerAutoHpRegeneRateInSleep(BigDecimal playerAutoHpRegeneRateInSleep) {
		PlayerAutoHpRegeneRateInSleep = playerAutoHpRegeneRateInSleep;
	}

	public BigDecimal getPalStomachDecreaceRate() {
		return PalStomachDecreaceRate;
	}

	public void setPalStomachDecreaceRate(BigDecimal palStomachDecreaceRate) {
		PalStomachDecreaceRate = palStomachDecreaceRate;
	}

	public BigDecimal getPalStaminaDecreaceRate() {
		return PalStaminaDecreaceRate;
	}

	public void setPalStaminaDecreaceRate(BigDecimal palStaminaDecreaceRate) {
		PalStaminaDecreaceRate = palStaminaDecreaceRate;
	}

	public BigDecimal getPalAutoHPRegeneRate() {
		return PalAutoHPRegeneRate;
	}

	public void setPalAutoHPRegeneRate(BigDecimal palAutoHPRegeneRate) {
		PalAutoHPRegeneRate = palAutoHPRegeneRate;
	}

	public BigDecimal getPalAutoHpRegeneRateInSleep() {
		return PalAutoHpRegeneRateInSleep;
	}

	public void setPalAutoHpRegeneRateInSleep(BigDecimal palAutoHpRegeneRateInSleep) {
		PalAutoHpRegeneRateInSleep = palAutoHpRegeneRateInSleep;
	}

	public BigDecimal getBuildObjectDamageRate() {
		return BuildObjectDamageRate;
	}

	public void setBuildObjectDamageRate(BigDecimal buildObjectDamageRate) {
		BuildObjectDamageRate = buildObjectDamageRate;
	}

	public BigDecimal getBuildObjectDeteriorationDamageRate() {
		return BuildObjectDeteriorationDamageRate;
	}

	public void setBuildObjectDeteriorationDamageRate(BigDecimal buildObjectDeteriorationDamageRate) {
		BuildObjectDeteriorationDamageRate = buildObjectDeteriorationDamageRate;
	}

	public BigDecimal getCollectionDropRate() {
		return CollectionDropRate;
	}

	public void setCollectionDropRate(BigDecimal collectionDropRate) {
		CollectionDropRate = collectionDropRate;
	}

	public BigDecimal getCollectionObjectHpRate() {
		return CollectionObjectHpRate;
	}

	public void setCollectionObjectHpRate(BigDecimal collectionObjectHpRate) {
		CollectionObjectHpRate = collectionObjectHpRate;
	}

	public BigDecimal getCollectionObjectRespawnSpeedRate() {
		return CollectionObjectRespawnSpeedRate;
	}

	public void setCollectionObjectRespawnSpeedRate(BigDecimal collectionObjectRespawnSpeedRate) {
		CollectionObjectRespawnSpeedRate = collectionObjectRespawnSpeedRate;
	}

	public BigDecimal getEnemyDropItemRate() {
		return EnemyDropItemRate;
	}

	public void setEnemyDropItemRate(BigDecimal enemyDropItemRate) {
		EnemyDropItemRate = enemyDropItemRate;
	}

	public String getDeathPenalty() {
		return DeathPenalty;
	}

	public void setDeathPenalty(String deathPenalty) {
		DeathPenalty = deathPenalty;
	}

	public Boolean getBEnablePlayerToPlayerDamage() {
		return bEnablePlayerToPlayerDamage;
	}

	public void setBEnablePlayerToPlayerDamage(Boolean bEnablePlayerToPlayerDamage) {
		this.bEnablePlayerToPlayerDamage = bEnablePlayerToPlayerDamage;
	}

	public Boolean getBEnableFriendlyFire() {
		return bEnableFriendlyFire;
	}

	public void setBEnableFriendlyFire(Boolean bEnableFriendlyFire) {
		this.bEnableFriendlyFire = bEnableFriendlyFire;
	}

	public Boolean getBEnableInvaderEnemy() {
		return bEnableInvaderEnemy;
	}

	public void setBEnableInvaderEnemy(Boolean bEnableInvaderEnemy) {
		this.bEnableInvaderEnemy = bEnableInvaderEnemy;
	}

	public Boolean getBActiveUNKO() {
		return bActiveUNKO;
	}

	public void setBActiveUNKO(Boolean bActiveUNKO) {
		this.bActiveUNKO = bActiveUNKO;
	}

	public Boolean getBEnableAimAssistPad() {
		return bEnableAimAssistPad;
	}

	public void setBEnableAimAssistPad(Boolean bEnableAimAssistPad) {
		this.bEnableAimAssistPad = bEnableAimAssistPad;
	}

	public Boolean getBEnableAimAssistKeyboard() {
		return bEnableAimAssistKeyboard;
	}

	public void setBEnableAimAssistKeyboard(Boolean bEnableAimAssistKeyboard) {
		this.bEnableAimAssistKeyboard = bEnableAimAssistKeyboard;
	}

	public Integer getDropItemMaxNum() {
		return DropItemMaxNum;
	}

	public void setDropItemMaxNum(Integer dropItemMaxNum) {
		DropItemMaxNum = dropItemMaxNum;
	}

	public Integer getDropItemMaxNum_UNKO() {
		return DropItemMaxNum_UNKO;
	}

	public void setDropItemMaxNum_UNKO(Integer dropItemMaxNum_UNKO) {
		DropItemMaxNum_UNKO = dropItemMaxNum_UNKO;
	}

	public Integer getBaseCampMaxNum() {
		return BaseCampMaxNum;
	}

	public void setBaseCampMaxNum(Integer baseCampMaxNum) {
		BaseCampMaxNum = baseCampMaxNum;
	}

	public Integer getBaseCampWorkerMaxNum() {
		return BaseCampWorkerMaxNum;
	}

	public void setBaseCampWorkerMaxNum(Integer baseCampWorkerMaxNum) {
		BaseCampWorkerMaxNum = baseCampWorkerMaxNum;
	}

	public BigDecimal getDropItemAliveMaxHours() {
		return DropItemAliveMaxHours;
	}

	public void setDropItemAliveMaxHours(BigDecimal dropItemAliveMaxHours) {
		DropItemAliveMaxHours = dropItemAliveMaxHours;
	}

	public Boolean getBAutoResetGuildNoOnlinePlayers() {
		return bAutoResetGuildNoOnlinePlayers;
	}

	public void setBAutoResetGuildNoOnlinePlayers(Boolean bAutoResetGuildNoOnlinePlayers) {
		this.bAutoResetGuildNoOnlinePlayers = bAutoResetGuildNoOnlinePlayers;
	}

	public BigDecimal getAutoResetGuildTimeNoOnlinePlayers() {
		return AutoResetGuildTimeNoOnlinePlayers;
	}

	public void setAutoResetGuildTimeNoOnlinePlayers(BigDecimal autoResetGuildTimeNoOnlinePlayers) {
		AutoResetGuildTimeNoOnlinePlayers = autoResetGuildTimeNoOnlinePlayers;
	}

	public Integer getGuildPlayerMaxNum() {
		return GuildPlayerMaxNum;
	}

	public void setGuildPlayerMaxNum(Integer guildPlayerMaxNum) {
		GuildPlayerMaxNum = guildPlayerMaxNum;
	}

	public BigDecimal getPalEggDefaultHatchingTime() {
		return PalEggDefaultHatchingTime;
	}

	public void setPalEggDefaultHatchingTime(BigDecimal palEggDefaultHatchingTime) {
		PalEggDefaultHatchingTime = palEggDefaultHatchingTime;
	}

	public BigDecimal getWorkSpeedRate() {
		return WorkSpeedRate;
	}

	public void setWorkSpeedRate(BigDecimal workSpeedRate) {
		WorkSpeedRate = workSpeedRate;
	}

	public Boolean getBIsMultiplay() {
		return bIsMultiplay;
	}

	public void setBIsMultiplay(Boolean bIsMultiplay) {
		this.bIsMultiplay = bIsMultiplay;
	}

	public Boolean getBIsPvP() {
		return bIsPvP;
	}

	public void setBIsPvP(Boolean bIsPvP) {
		this.bIsPvP = bIsPvP;
	}

	public Boolean getBCanPickupOtherGuildDeathPenaltyDrop() {
		return bCanPickupOtherGuildDeathPenaltyDrop;
	}

	public void setBCanPickupOtherGuildDeathPenaltyDrop(Boolean bCanPickupOtherGuildDeathPenaltyDrop) {
		this.bCanPickupOtherGuildDeathPenaltyDrop = bCanPickupOtherGuildDeathPenaltyDrop;
	}

	public Boolean getBEnableNonLoginPenalty() {
		return bEnableNonLoginPenalty;
	}

	public void setBEnableNonLoginPenalty(Boolean bEnableNonLoginPenalty) {
		this.bEnableNonLoginPenalty = bEnableNonLoginPenalty;
	}

	public Boolean getBEnableFastTravel() {
		return bEnableFastTravel;
	}

	public void setBEnableFastTravel(Boolean bEnableFastTravel) {
		this.bEnableFastTravel = bEnableFastTravel;
	}

	public Boolean getBIsStartLocationSelectByMap() {
		return bIsStartLocationSelectByMap;
	}

	public void setBIsStartLocationSelectByMap(Boolean bIsStartLocationSelectByMap) {
		this.bIsStartLocationSelectByMap = bIsStartLocationSelectByMap;
	}

	public Boolean getBExistPlayerAfterLogout() {
		return bExistPlayerAfterLogout;
	}

	public void setBExistPlayerAfterLogout(Boolean bExistPlayerAfterLogout) {
		this.bExistPlayerAfterLogout = bExistPlayerAfterLogout;
	}

	public Boolean getBEnableDefenseOtherGuildPlayer() {
		return bEnableDefenseOtherGuildPlayer;
	}

	public void setBEnableDefenseOtherGuildPlayer(Boolean bEnableDefenseOtherGuildPlayer) {
		this.bEnableDefenseOtherGuildPlayer = bEnableDefenseOtherGuildPlayer;
	}

	public Integer getCoopPlayerMaxNum() {
		return CoopPlayerMaxNum;
	}

	public void setCoopPlayerMaxNum(Integer coopPlayerMaxNum) {
		CoopPlayerMaxNum = coopPlayerMaxNum;
	}

	public Integer getServerPlayerMaxNum() {
		return ServerPlayerMaxNum;
	}

	public void setServerPlayerMaxNum(Integer serverPlayerMaxNum) {
		ServerPlayerMaxNum = serverPlayerMaxNum;
	}

	public String getServerName() {
		return ServerName;
	}

	public void setServerName(String serverName) {
		ServerName = serverName;
	}

	public String getServerDescription() {
		return ServerDescription;
	}

	public void setServerDescription(String serverDescription) {
		ServerDescription = serverDescription;
	}

	public String getAdminPassword() {
		return AdminPassword;
	}

	public void setAdminPassword(String adminPassword) {
		AdminPassword = adminPassword;
	}

	public String getServerPassword() {
		return ServerPassword;
	}

	public void setServerPassword(String serverPassword) {
		ServerPassword = serverPassword;
	}

	public Integer getPublicPort() {
		return PublicPort;
	}

	public void setPublicPort(Integer publicPort) {
		PublicPort = publicPort;
	}

	public String getPublicIP() {
		return PublicIP;
	}

	public void setPublicIP(String publicIP) {
		PublicIP = publicIP;
	}

	public Boolean getRCONEnabled() {
		return RCONEnabled;
	}

	public void setRCONEnabled(Boolean RCONEnabled) {
		this.RCONEnabled = RCONEnabled;
	}

	public Integer getRCONPort() {
		return RCONPort;
	}

	public void setRCONPort(Integer RCONPort) {
		this.RCONPort = RCONPort;
	}

	public String getRegion() {
		return Region;
	}

	public void setRegion(String region) {
		Region = region;
	}

	public Boolean getBUseAuth() {
		return bUseAuth;
	}

	public void setBUseAuth(Boolean bUseAuth) {
		this.bUseAuth = bUseAuth;
	}

	public String getBanListURL() {
		return BanListURL;
	}

	public void setBanListURL(String banListURL) {
		BanListURL = banListURL;
	}

	public String toJsonString() {
		final StringBuilder sb = new StringBuilder("{");
		sb.append("\"Difficulty\":\"").append(Difficulty).append("\",");
		sb.append("\"DayTimeSpeedRate\":").append(DayTimeSpeedRate).append(",");
		sb.append("\"NightTimeSpeedRate\":").append(NightTimeSpeedRate).append(",");
		sb.append("\"ExpRate\":").append(ExpRate).append(",");
		sb.append("\"PalCaptureRate\":").append(PalCaptureRate).append(",");
		sb.append("\"PalSpawnNumRate\":").append(PalSpawnNumRate).append(",");
		sb.append("\"PalDamageRateAttack\":").append(PalDamageRateAttack).append(",");
		sb.append("\"PalDamageRateDefense\":").append(PalDamageRateDefense).append(",");
		sb.append("\"PlayerDamageRateAttack\":").append(PlayerDamageRateAttack).append(",");
		sb.append("\"PlayerDamageRateDefense\":").append(PlayerDamageRateDefense).append(",");
		sb.append("\"PlayerStomachDecreaceRate\":").append(PlayerStomachDecreaceRate).append(",");
		sb.append("\"PlayerStaminaDecreaceRate\":").append(PlayerStaminaDecreaceRate).append(",");
		sb.append("\"PlayerAutoHPRegeneRate\":").append(PlayerAutoHPRegeneRate).append(",");
		sb.append("\"PlayerAutoHpRegeneRateInSleep\":").append(PlayerAutoHpRegeneRateInSleep).append(",");
		sb.append("\"PalStomachDecreaceRate\":").append(PalStomachDecreaceRate).append(",");
		sb.append("\"PalStaminaDecreaceRate\":").append(PalStaminaDecreaceRate).append(",");
		sb.append("\"PalAutoHPRegeneRate\":").append(PalAutoHPRegeneRate).append(",");
		sb.append("\"PalAutoHpRegeneRateInSleep\":").append(PalAutoHpRegeneRateInSleep).append(",");
		sb.append("\"BuildObjectDamageRate\":").append(BuildObjectDamageRate).append(",");
		sb.append("\"BuildObjectDeteriorationDamageRate\":").append(BuildObjectDeteriorationDamageRate).append(",");
		sb.append("\"CollectionDropRate\":").append(CollectionDropRate).append(",");
		sb.append("\"CollectionObjectHpRate\":").append(CollectionObjectHpRate).append(",");
		sb.append("\"CollectionObjectRespawnSpeedRate\":").append(CollectionObjectRespawnSpeedRate).append(",");
		sb.append("\"EnemyDropItemRate\":").append(EnemyDropItemRate).append(",");
		sb.append("\"DeathPenalty\":\"").append(DeathPenalty).append("\",");
		sb.append("\"bEnablePlayerToPlayerDamage\":").append(bEnablePlayerToPlayerDamage).append(",");
		sb.append("\"bEnableFriendlyFire\":").append(bEnableFriendlyFire).append(",");
		sb.append("\"bEnableInvaderEnemy\":").append(bEnableInvaderEnemy).append(",");
		sb.append("\"bActiveUNKO\":").append(bActiveUNKO).append(",");
		sb.append("\"bEnableAimAssistPad\":").append(bEnableAimAssistPad).append(",");
		sb.append("\"bEnableAimAssistKeyboard\":").append(bEnableAimAssistKeyboard).append(",");
		sb.append("\"DropItemMaxNum\":").append(DropItemMaxNum).append(",");
		sb.append("\"DropItemMaxNum_UNKO\":").append(DropItemMaxNum_UNKO).append(",");
		sb.append("\"BaseCampMaxNum\":").append(BaseCampMaxNum).append(",");
		sb.append("\"BaseCampWorkerMaxNum\":").append(BaseCampWorkerMaxNum).append(",");
		sb.append("\"DropItemAliveMaxHours\":").append(DropItemAliveMaxHours).append(",");
		sb.append("\"bAutoResetGuildNoOnlinePlayers\":").append(bAutoResetGuildNoOnlinePlayers).append(",");
		sb.append("\"AutoResetGuildTimeNoOnlinePlayers\":").append(AutoResetGuildTimeNoOnlinePlayers).append(",");
		sb.append("\"GuildPlayerMaxNum\":").append(GuildPlayerMaxNum).append(",");
		sb.append("\"PalEggDefaultHatchingTime\":").append(PalEggDefaultHatchingTime).append(",");
		sb.append("\"WorkSpeedRate\":").append(WorkSpeedRate).append(",");
		sb.append("\"bIsMultiplay\":").append(bIsMultiplay).append(",");
		sb.append("\"bIsPvP\":").append(bIsPvP).append(",");
		sb.append("\"bCanPickupOtherGuildDeathPenaltyDrop\":").append(bCanPickupOtherGuildDeathPenaltyDrop).append(",");
		sb.append("\"bEnableNonLoginPenalty\":").append(bEnableNonLoginPenalty).append(",");
		sb.append("\"bEnableFastTravel\":").append(bEnableFastTravel).append(",");
		sb.append("\"bIsStartLocationSelectByMap\":").append(bIsStartLocationSelectByMap).append(",");
		sb.append("\"bExistPlayerAfterLogout\":").append(bExistPlayerAfterLogout).append(",");
		sb.append("\"bEnableDefenseOtherGuildPlayer\":").append(bEnableDefenseOtherGuildPlayer).append(",");
		sb.append("\"CoopPlayerMaxNum\":").append(CoopPlayerMaxNum).append(",");
		sb.append("\"ServerPlayerMaxNum\":").append(ServerPlayerMaxNum).append(",");
		sb.append("\"ServerName\":\"").append(ServerName).append("\",");
		sb.append("\"ServerDescription\":\"").append(ServerDescription).append("\",");
		sb.append("\"AdminPassword\":\"").append(AdminPassword).append("\",");
		sb.append("\"ServerPassword\":\"").append(ServerPassword).append("\",");
		sb.append("\"PublicPort\":").append(PublicPort).append(",");
		sb.append("\"PublicIP\":\"").append(PublicIP).append("\",");
		sb.append("\"RCONEnabled\":").append(RCONEnabled).append(",");
		sb.append("\"RCONPort\":").append(RCONPort).append(",");
		sb.append("\"Region\":\"").append(Region).append("\",");
		sb.append("\"bUseAuth\":").append(bUseAuth).append(",");
		sb.append("\"BanListURL\":\"").append(BanListURL).append("\",");
		if (sb.lastIndexOf(",") != -1) {
			sb.deleteCharAt(sb.lastIndexOf(","));
		}
		sb.append('}');
		return sb.toString();
	}

	public String toSettingFileString() {
		final StringBuilder sb = new StringBuilder("");
		sb.append("[/Script/Pal.PalGameWorldSettings]\n");
		sb.append("OptionSettings=(");
		sb.append("Difficulty=").append(Difficulty).append(",");
		sb.append("DayTimeSpeedRate=").append(DayTimeSpeedRate.setScale(6)).append(",");
		sb.append("NightTimeSpeedRate=").append(NightTimeSpeedRate.setScale(6)).append(",");
		sb.append("ExpRate=").append(ExpRate.setScale(6)).append(",");
		sb.append("PalCaptureRate=").append(PalCaptureRate.setScale(6)).append(",");
		sb.append("PalSpawnNumRate=").append(PalSpawnNumRate.setScale(6)).append(",");
		sb.append("PalDamageRateAttack=").append(PalDamageRateAttack.setScale(6)).append(",");
		sb.append("PalDamageRateDefense=").append(PalDamageRateDefense.setScale(6)).append(",");
		sb.append("PlayerDamageRateAttack=").append(PlayerDamageRateAttack.setScale(6)).append(",");
		sb.append("PlayerDamageRateDefense=").append(PlayerDamageRateDefense.setScale(6)).append(",");
		sb.append("PlayerStomachDecreaceRate=").append(PlayerStomachDecreaceRate.setScale(6)).append(",");
		sb.append("PlayerStaminaDecreaceRate=").append(PlayerStaminaDecreaceRate.setScale(6)).append(",");
		sb.append("PlayerAutoHPRegeneRate=").append(PlayerAutoHPRegeneRate.setScale(6)).append(",");
		sb.append("PlayerAutoHpRegeneRateInSleep=").append(PlayerAutoHpRegeneRateInSleep.setScale(6)).append(",");
		sb.append("PalStomachDecreaceRate=").append(PalStomachDecreaceRate.setScale(6)).append(",");
		sb.append("PalStaminaDecreaceRate=").append(PalStaminaDecreaceRate.setScale(6)).append(",");
		sb.append("PalAutoHPRegeneRate=").append(PalAutoHPRegeneRate.setScale(6)).append(",");
		sb.append("PalAutoHpRegeneRateInSleep=").append(PalAutoHpRegeneRateInSleep.setScale(6)).append(",");
		sb.append("BuildObjectDamageRate=").append(BuildObjectDamageRate.setScale(6)).append(",");
		sb.append("BuildObjectDeteriorationDamageRate=").append(BuildObjectDeteriorationDamageRate.setScale(6)).append(",");
		sb.append("CollectionDropRate=").append(CollectionDropRate.setScale(6)).append(",");
		sb.append("CollectionObjectHpRate=").append(CollectionObjectHpRate.setScale(6)).append(",");
		sb.append("CollectionObjectRespawnSpeedRate=").append(CollectionObjectRespawnSpeedRate.setScale(6)).append(",");
		sb.append("EnemyDropItemRate=").append(EnemyDropItemRate.setScale(6)).append(",");
		sb.append("DeathPenalty=").append(DeathPenalty).append(",");
		sb.append("bEnablePlayerToPlayerDamage=").append(bEnablePlayerToPlayerDamage != null && bEnablePlayerToPlayerDamage ? "True" : "False").append(",");
		sb.append("bEnableFriendlyFire=").append(bEnableFriendlyFire != null && bEnableFriendlyFire ? "True" : "False").append(",");
		sb.append("bEnableInvaderEnemy=").append(bEnableInvaderEnemy != null && bEnableInvaderEnemy ? "True" : "False").append(",");
		sb.append("bActiveUNKO=").append(bActiveUNKO != null && bActiveUNKO ? "True" : "False").append(",");
		sb.append("bEnableAimAssistPad=").append(bEnableAimAssistPad != null && bEnableAimAssistPad ? "True" : "False").append(",");
		sb.append("bEnableAimAssistKeyboard=").append(bEnableAimAssistKeyboard != null && bEnableAimAssistKeyboard ? "True" : "False").append(",");
		sb.append("DropItemMaxNum=").append(DropItemMaxNum).append(",");
		sb.append("DropItemMaxNum_UNKO=").append(DropItemMaxNum_UNKO).append(",");
		sb.append("BaseCampMaxNum=").append(BaseCampMaxNum).append(",");
		sb.append("BaseCampWorkerMaxNum=").append(BaseCampWorkerMaxNum).append(",");
		sb.append("DropItemAliveMaxHours=").append(DropItemAliveMaxHours.setScale(6)).append(",");
		sb.append("bAutoResetGuildNoOnlinePlayers=").append(bAutoResetGuildNoOnlinePlayers != null && bAutoResetGuildNoOnlinePlayers ? "True" : "False").append(",");
		sb.append("AutoResetGuildTimeNoOnlinePlayers=").append(AutoResetGuildTimeNoOnlinePlayers.setScale(6)).append(",");
		sb.append("GuildPlayerMaxNum=").append(GuildPlayerMaxNum).append(",");
		sb.append("PalEggDefaultHatchingTime=").append(PalEggDefaultHatchingTime.setScale(6)).append(",");
		sb.append("WorkSpeedRate=").append(WorkSpeedRate.setScale(6)).append(",");
		sb.append("bIsMultiplay=").append(bIsMultiplay != null && bIsMultiplay ? "True" : "False").append(",");
		sb.append("bIsPvP=").append(bIsPvP != null && bIsPvP ? "True" : "False").append(",");
		sb.append("bCanPickupOtherGuildDeathPenaltyDrop=").append(bCanPickupOtherGuildDeathPenaltyDrop != null && bCanPickupOtherGuildDeathPenaltyDrop ? "True" : "False").append(",");
		sb.append("bEnableNonLoginPenalty=").append(bEnableNonLoginPenalty != null && bEnableNonLoginPenalty ? "True" : "False").append(",");
		sb.append("bEnableFastTravel=").append(bEnableFastTravel != null && bEnableFastTravel ? "True" : "False").append(",");
		sb.append("bIsStartLocationSelectByMap=").append(bIsStartLocationSelectByMap != null && bIsStartLocationSelectByMap ? "True" : "False").append(",");
		sb.append("bExistPlayerAfterLogout=").append(bExistPlayerAfterLogout != null && bExistPlayerAfterLogout ? "True" : "False").append(",");
		sb.append("bEnableDefenseOtherGuildPlayer=").append(bEnableDefenseOtherGuildPlayer != null && bEnableDefenseOtherGuildPlayer ? "True" : "False").append(",");
		sb.append("CoopPlayerMaxNum=").append(CoopPlayerMaxNum).append(",");
		sb.append("ServerPlayerMaxNum=").append(ServerPlayerMaxNum).append(",");
		sb.append("ServerName=\"").append(ServerName).append("\",");
		sb.append("ServerDescription=\"").append(ServerDescription).append("\",");
		sb.append("AdminPassword=\"").append(AdminPassword).append("\",");
		sb.append("ServerPassword=\"").append(ServerPassword).append("\",");
		sb.append("PublicPort=").append(PublicPort).append(",");
		sb.append("PublicIP=\"").append(PublicIP).append("\",");
		sb.append("RCONEnabled=").append(RCONEnabled != null && RCONEnabled ? "True" : "False").append(",");
		sb.append("RCONPort=").append(RCONPort).append(",");
		sb.append("Region=\"").append(Region).append("\",");
		sb.append("bUseAuth=").append(bUseAuth != null && bUseAuth ? "True" : "False").append(",");
		sb.append("BanListURL=\"").append(BanListURL).append("\"");
		sb.append(')');
		return sb.toString();
	}
}

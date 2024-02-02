package com.slq.palworldconfig.model;

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
	private boolean bEnablePlayerToPlayerDamage; // =False,  ; 启用玩家对玩家伤害功能
	private boolean bEnableFriendlyFire; // =False,  ; 火焰伤害
	private boolean bEnableInvaderEnemy; // =True,   ; 否会发生袭击事件
	private boolean bActiveUNKO; // =False,  ; ？？
	private boolean bEnableAimAssistPad; // =True,   ; 启用瞄准辅助手柄
	private boolean bEnableAimAssistKeyboard; // =False, ; 准星开启
	private BigDecimal DropItemMaxNum; // =3000,    ; 掉落物品最大数量
	private BigDecimal DropItemMaxNum_UNKO; // =100,    ; 掉落物品最大数量_UNKO
	private int BaseCampMaxNum; // =128, ; 大本营最大数
	private int BaseCampWorkerMaxNum; // =15,    ; 大本营工人最多人数
	private BigDecimal DropItemAliveMaxHours; // =1.000000, ; 掉落物品存在最大时长
	private boolean bAutoResetGuildNoOnlinePlayers; // =False,   ; 自动重置没有在线玩家的公会
	private BigDecimal AutoResetGuildTimeNoOnlinePlayers; // =72.000000,    ; 无在线玩家时自动重置生成时间
	private int GuildPlayerMaxNum = 20; // ,;公会玩家最大数量
	private BigDecimal PalEggDefaultHatchingTime; // =72.000000,    ; 帕鲁蛋默认孵化时间
	private BigDecimal WorkSpeedRate; // =1.000000, ; 工作速率
	private boolean bIsMultiplay; // =False, ; 多人游戏
	private boolean bIsPvP; // =False,   ; PvP
	private boolean bCanPickupOtherGuildDeathPenaltyDrop; // =False, ; 可拾取其他公会的死亡掉落物
	private boolean bEnableNonLoginPenalty; // =True,    ; 启用不登录惩罚
	private boolean bEnableFastTravel; // =True, ; 启用快速旅行
	private boolean bIsStartLocationSelectByMap; // =True,   ; 通过地图选择起始位置
	private boolean bExistPlayerAfterLogout; // =False,  ; 注销后玩家仍然存在
	private boolean bEnableDefenseOtherGuildPlayer; // =False,   ; 启用防御其他公会玩家功能
	private int CoopPlayerMaxNum = 4; // ,; 合作玩家最大人数
	private int ServerPlayerMaxNum; //  = 32,;服务器玩家最大人数
	private String ServerName; // ="Default Palworld Server",   ; 服务器名称
	private String ServerDescription; // ="",   ; 服务器描述
	private String AdminPassword; // ="",   ; 管理员密码
	private String ServerPassword; // ="",  ; 服务器密码
	private int PublicPort; //服务器端口  = 8211
	private String PublicIP; // ="",    ; 服务器ip
	private boolean RCONEnabled; // =False,  ; 启用 RCON
	private int RCONPort; // =25575, ; RCON端口
	private String Region; // ="",  ; 地区
	private boolean bUseAuth; // =True,  ; 使用授权
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

	public boolean isbEnablePlayerToPlayerDamage() {
		return bEnablePlayerToPlayerDamage;
	}

	public void setbEnablePlayerToPlayerDamage(boolean bEnablePlayerToPlayerDamage) {
		this.bEnablePlayerToPlayerDamage = bEnablePlayerToPlayerDamage;
	}

	public boolean isbEnableFriendlyFire() {
		return bEnableFriendlyFire;
	}

	public void setbEnableFriendlyFire(boolean bEnableFriendlyFire) {
		this.bEnableFriendlyFire = bEnableFriendlyFire;
	}

	public boolean isbEnableInvaderEnemy() {
		return bEnableInvaderEnemy;
	}

	public void setbEnableInvaderEnemy(boolean bEnableInvaderEnemy) {
		this.bEnableInvaderEnemy = bEnableInvaderEnemy;
	}

	public boolean isbActiveUNKO() {
		return bActiveUNKO;
	}

	public void setbActiveUNKO(boolean bActiveUNKO) {
		this.bActiveUNKO = bActiveUNKO;
	}

	public boolean isbEnableAimAssistPad() {
		return bEnableAimAssistPad;
	}

	public void setbEnableAimAssistPad(boolean bEnableAimAssistPad) {
		this.bEnableAimAssistPad = bEnableAimAssistPad;
	}

	public boolean isbEnableAimAssistKeyboard() {
		return bEnableAimAssistKeyboard;
	}

	public void setbEnableAimAssistKeyboard(boolean bEnableAimAssistKeyboard) {
		this.bEnableAimAssistKeyboard = bEnableAimAssistKeyboard;
	}

	public BigDecimal getDropItemMaxNum() {
		return DropItemMaxNum;
	}

	public void setDropItemMaxNum(BigDecimal dropItemMaxNum) {
		DropItemMaxNum = dropItemMaxNum;
	}

	public BigDecimal getDropItemMaxNum_UNKO() {
		return DropItemMaxNum_UNKO;
	}

	public void setDropItemMaxNum_UNKO(BigDecimal dropItemMaxNum_UNKO) {
		DropItemMaxNum_UNKO = dropItemMaxNum_UNKO;
	}

	public int getBaseCampMaxNum() {
		return BaseCampMaxNum;
	}

	public void setBaseCampMaxNum(int baseCampMaxNum) {
		BaseCampMaxNum = baseCampMaxNum;
	}

	public int getBaseCampWorkerMaxNum() {
		return BaseCampWorkerMaxNum;
	}

	public void setBaseCampWorkerMaxNum(int baseCampWorkerMaxNum) {
		BaseCampWorkerMaxNum = baseCampWorkerMaxNum;
	}

	public BigDecimal getDropItemAliveMaxHours() {
		return DropItemAliveMaxHours;
	}

	public void setDropItemAliveMaxHours(BigDecimal dropItemAliveMaxHours) {
		DropItemAliveMaxHours = dropItemAliveMaxHours;
	}

	public boolean isbAutoResetGuildNoOnlinePlayers() {
		return bAutoResetGuildNoOnlinePlayers;
	}

	public void setbAutoResetGuildNoOnlinePlayers(boolean bAutoResetGuildNoOnlinePlayers) {
		this.bAutoResetGuildNoOnlinePlayers = bAutoResetGuildNoOnlinePlayers;
	}

	public BigDecimal getAutoResetGuildTimeNoOnlinePlayers() {
		return AutoResetGuildTimeNoOnlinePlayers;
	}

	public void setAutoResetGuildTimeNoOnlinePlayers(BigDecimal autoResetGuildTimeNoOnlinePlayers) {
		AutoResetGuildTimeNoOnlinePlayers = autoResetGuildTimeNoOnlinePlayers;
	}

	public int getGuildPlayerMaxNum() {
		return GuildPlayerMaxNum;
	}

	public void setGuildPlayerMaxNum(int guildPlayerMaxNum) {
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

	public boolean isbIsMultiplay() {
		return bIsMultiplay;
	}

	public void setbIsMultiplay(boolean bIsMultiplay) {
		this.bIsMultiplay = bIsMultiplay;
	}

	public boolean isbIsPvP() {
		return bIsPvP;
	}

	public void setbIsPvP(boolean bIsPvP) {
		this.bIsPvP = bIsPvP;
	}

	public boolean isbCanPickupOtherGuildDeathPenaltyDrop() {
		return bCanPickupOtherGuildDeathPenaltyDrop;
	}

	public void setbCanPickupOtherGuildDeathPenaltyDrop(boolean bCanPickupOtherGuildDeathPenaltyDrop) {
		this.bCanPickupOtherGuildDeathPenaltyDrop = bCanPickupOtherGuildDeathPenaltyDrop;
	}

	public boolean isbEnableNonLoginPenalty() {
		return bEnableNonLoginPenalty;
	}

	public void setbEnableNonLoginPenalty(boolean bEnableNonLoginPenalty) {
		this.bEnableNonLoginPenalty = bEnableNonLoginPenalty;
	}

	public boolean isbEnableFastTravel() {
		return bEnableFastTravel;
	}

	public void setbEnableFastTravel(boolean bEnableFastTravel) {
		this.bEnableFastTravel = bEnableFastTravel;
	}

	public boolean isbIsStartLocationSelectByMap() {
		return bIsStartLocationSelectByMap;
	}

	public void setbIsStartLocationSelectByMap(boolean bIsStartLocationSelectByMap) {
		this.bIsStartLocationSelectByMap = bIsStartLocationSelectByMap;
	}

	public boolean isbExistPlayerAfterLogout() {
		return bExistPlayerAfterLogout;
	}

	public void setbExistPlayerAfterLogout(boolean bExistPlayerAfterLogout) {
		this.bExistPlayerAfterLogout = bExistPlayerAfterLogout;
	}

	public boolean isbEnableDefenseOtherGuildPlayer() {
		return bEnableDefenseOtherGuildPlayer;
	}

	public void setbEnableDefenseOtherGuildPlayer(boolean bEnableDefenseOtherGuildPlayer) {
		this.bEnableDefenseOtherGuildPlayer = bEnableDefenseOtherGuildPlayer;
	}

	public int getCoopPlayerMaxNum() {
		return CoopPlayerMaxNum;
	}

	public void setCoopPlayerMaxNum(int coopPlayerMaxNum) {
		CoopPlayerMaxNum = coopPlayerMaxNum;
	}

	public int getServerPlayerMaxNum() {
		return ServerPlayerMaxNum;
	}

	public void setServerPlayerMaxNum(int serverPlayerMaxNum) {
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

	public int getPublicPort() {
		return PublicPort;
	}

	public void setPublicPort(int publicPort) {
		PublicPort = publicPort;
	}

	public String getPublicIP() {
		return PublicIP;
	}

	public void setPublicIP(String publicIP) {
		PublicIP = publicIP;
	}

	public boolean isRCONEnabled() {
		return RCONEnabled;
	}

	public void setRCONEnabled(boolean RCONEnabled) {
		this.RCONEnabled = RCONEnabled;
	}

	public int getRCONPort() {
		return RCONPort;
	}

	public void setRCONPort(int RCONPort) {
		this.RCONPort = RCONPort;
	}

	public String getRegion() {
		return Region;
	}

	public void setRegion(String region) {
		Region = region;
	}

	public boolean isbUseAuth() {
		return bUseAuth;
	}

	public void setbUseAuth(boolean bUseAuth) {
		this.bUseAuth = bUseAuth;
	}

	public String getBanListURL() {
		return BanListURL;
	}

	public void setBanListURL(String banListURL) {
		BanListURL = banListURL;
	}
}

package com.coinomi.core.coins;

import com.coinomi.core.coins.families.BitFamily;

/**
 * @author John L. Jegutanis
 */
public class CbitMain extends CoinType {
    private CbitMain() {
        id = "cbit.main";

        addressHeader = 0;
        p2shHeader = 5;
        acceptableAddressCodes = new int[] { addressHeader, p2shHeader };
        spendableCoinbaseDepth = 100;
        dumpedPrivateKeyHeader = 128;

        family = BitFamily.get();
        name = "C-Bit";
        symbol = "XCT";
        uriScheme = "cbit";
        bip44Index = 0;
        unitExponent = 8;
        feePerKb = value(10000);
        minNonDust = value(5460);
        softDustLimit = value(1000000); // 0.01 BTC
        softDustPolicy = SoftDustPolicy.AT_LEAST_BASE_FEE_IF_SOFT_DUST_TXO_PRESENT;
        signedMessageHeader = toBytes("C-Bit Signed Message:\n");
    }

    private static CbitMain instance = new CbitMain();
    public static synchronized CbitMain get() {
        return instance;
    }
}

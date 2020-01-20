package com.imooc.lib_network.okhttp.listener;

/**
 *  与应用层进行通信
 *
 */

public interface DisposeDataListener {

    void onSuccess(Object responseObj);

    void onFailure(Object reasonObj);
}

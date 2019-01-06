package com.shako.root.isbn_0_201_89551_x.section3._1_osgsp.util;

import com.shako.root.isbn_0_201_89551_x.section3._1_osgsp.domain.common.Message;
import com.shako.root.isbn_0_201_89551_x.section3._1_osgsp.domain.common.Signal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Менагер для управления операцией разобщения или объединения при передаче сигналов, сообщений и т.д.
 *
 * T - Transmitter
 * R - Receiver
 *
 * Ограничения:
 * трансмиттером может выступать любой тип. а ресивером только родительский интерфейс-тип для всех ресиверов, но
 * экземпляры - конкретные.
 */
public class ForkJoinManager<T, R> {

    private ForkJoin state;
    private T transmitter;
    private List<R> receivers;
    private Message msg;
    private Signal signal;

    {
        receivers = new ArrayList<>();
    }

    public ForkJoinManager() {}
    public ForkJoinManager(ForkJoin state) {
        this.state = state;
    }
    public ForkJoinManager(ForkJoin state,T transmitter, R receiver, Message msg) {
        this.state = state;
        this.transmitter = transmitter;
        receivers.add(receiver);
        this.msg = msg;
    }

    public void addReceiver(R receiver) {
        receivers.add(Optional.ofNullable(receiver).get());
    }
    void sendMessage() {}

    public ForkJoin getState() {
        return state;
    }
    public void setState(ForkJoin state) {
        this.state = state;
    }
    public T getTransmitter() {
        return transmitter;
    }
    public void setTransmitter(T transmitter) {
        this.transmitter = transmitter;
    }
    public List<R> getReceivers() {
        return receivers;
    }
    public void setReceivers(List<R> receivers) {
        this.receivers = receivers;
    }
    public Message getMsg() {
        return msg;
    }
    public void setMsg(Message msg) {
        this.msg = msg;
    }
    public Signal getSignal() {
        return signal;
    }
    public void setSignal(Signal signal) {
        this.signal = signal;
    }
}

package com.java.dsign.FactoryPattern.abstractFactory2.factory;

import com.java.dsign.FactoryPattern.abstractFactory2.iiterface.AssembleFactory;
import com.java.dsign.FactoryPattern.abstractFactory2.iiterface.CarFactory;
import com.java.dsign.FactoryPattern.abstractFactory2.iiterface.PartsManufacturingFactory;
import com.java.dsign.FactoryPattern.abstractFactory2.iiterface.PenqiFactory;
import com.java.dsign.FactoryPattern.abstractFactory2.impl.AssembleService;
import com.java.dsign.FactoryPattern.abstractFactory2.impl.PartsManufacturingService;
import com.java.dsign.FactoryPattern.abstractFactory2.impl.PenqiService;

public class BmwFactory implements CarFactory {
    @Override
    public PartsManufacturingFactory getPartsManufacturingFactory() {
        return new PartsManufacturingService();
    }

    @Override
    public AssembleFactory getAssembleFactory() {
        return new AssembleService();
    }

    @Override
    public PenqiFactory getPenqiFactory() {
        return new PenqiService();
    }
}
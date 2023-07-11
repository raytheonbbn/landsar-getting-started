/*
LandSAR Motion Model Software Development Kit
Copyright (c) 2023 Raytheon Technologies 

This program is free software: you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with this program.  If not, see <https://www.gnu.org/licenses/>.
*/
package com.bbn.example;

import com.bbn.landsar.motionmodel.*;
import com.bbn.landsar.search.LandsarSearch;
import com.bbn.landsar.search.SearchUtilities;
import com.bbn.landsar.utils.StatusUpdateMessage;
import com.bbn.roger.annotation.Plugin;
import com.bbn.roger.config.AttributeDescription;
import com.bbn.roger.plugin.PluginContext;
import com.bbn.roger.plugin.exception.InsufficientConfigurationException;
import com.bbn.roger.plugin.exception.RogerInstantiationException;

import java.io.File;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/**
This is meant to be a starting point for a new motion model plugin.
For example implemented Motion Model Plugins, see https://github.com/raytheonbbn/landsar-sdk/tree/main/src/main/java/com/bbn/landsar/motionmodel/example
*/
@Plugin
public class MyPlugin implements LandMotionModelPlugin {

    private String name;
    private MotionModelManager motionModelManager;

    @Override
    public void setName(String s) {
        this.name = s;
    }

    @Override
    public String getName() {
        return this.getName();
    }

    @Override
    public void setMotionModelManager(MotionModelManager motionModelManager) {
        this.motionModelManager = motionModelManager;
    }

    @Override
    public Set<MotionModelAttributeDescription> getMotionModelParameters() {
        return null;
    }

    @Override
    public Set<GeospatialInputDescriptions> getMotionModelGeospatialDescriptions() {
        return null;
    }

    @Override
    public boolean validateMotionModelParameters(Map<String, Object> map, UserEnteredGeospatialData userEnteredGeospatialData, StatusUpdateMessage statusUpdateMessage) {
        return false;
    }

    @Override
    public MotionModelResult generateInitialDistribution(MotionModelInput motionModelInput) {
        return null;
    }

    @Override
    public double calculateProbabilityOfSuccess(UUID uuid, Set<? extends LandsarSearch> set) {
        return 0;
    }

    @Override
    public MotionModelResult updateProbabilityDistributionForSearch(MotionModelResult motionModelResult, LandsarSearch landsarSearch, SearchUtilities searchUtilities) {
        return null;
    }

    @Override
    public MotionModelResult cancelSearch(MotionModelResult motionModelResult, LandsarSearch landsarSearch) {
        return null;
    }

    @Override
    public void deleteModelState(List<UUID> list) {

    }

    @Override
    public void restoreModelState(UUID uuid, Map<String, File> map) {

    }

    @Override
    public void start() {

    }

    @Override
    public void stop() {

    }

    @Override
    public boolean isStarted() {
        return false;
    }

    @Override
    public void configure(Map<String, Object> map, PluginContext pluginContext) throws InsufficientConfigurationException {

    }

    @Override
    public void initialize() throws RogerInstantiationException {

    }

    @Override
    public Set<AttributeDescription> getConfigurationAttributes() {
        return null;
    }
}

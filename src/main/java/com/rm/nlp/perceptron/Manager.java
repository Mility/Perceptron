package com.rm.nlp.perceptron;

import java.util.ArrayList;

import com.rm.nlp.perceptron.algorithm.AlgorithmType;
import com.rm.nlp.perceptron.io.DatasetCreator;

public final class Manager {
	
	private static ArrayList<String> prepositionList;
	private static AlgorithmType baselineAlgorithmType;
	private static AlgorithmType mainAlgorithmType;
	
	public static ArrayList<String> getPrepositionList() {
		return prepositionList;
	}

	public static void setPrepositionList(ArrayList<String> prepositionList) {
		Manager.prepositionList = prepositionList;
	}

	public static AlgorithmType getBaselineAlgorithmType() {
		return baselineAlgorithmType;
	}

	public static void setBaselineAlgorithmType(AlgorithmType baselineAlgorithmType) {
		Manager.baselineAlgorithmType = baselineAlgorithmType;
	}

	public static AlgorithmType getMainAlgorithmType() {
		return mainAlgorithmType;
	}

	public static void setMainAlgorithmType(AlgorithmType mainAlgorithmType) {
		Manager.mainAlgorithmType = mainAlgorithmType;
	}
	
	public static void executeBaseline() {
		//FeatureVectorFactory.getVector
		
		//AlgorithmFactory.getAlgorithm
		
		//Algorithm.run(vector)
	}
	
	private static void prepareDataset() {
		DatasetCreator.build();
	}

}

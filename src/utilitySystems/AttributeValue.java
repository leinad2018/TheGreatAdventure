package utilitySystems;

import squadSystems.AttributeType;

public class AttributeValue {
	private AttributeType type;
	private double value;

	/**
	 * A handy class for passing attributes
	 * @param type
	 * @param value
	 */
	public AttributeValue(AttributeType type, double value) {
		this.type = type;
		this.value = value;
	}
	
	public AttributeType getType(){
		return type;
	}
	
	public double getValue(){
		return value;
	}
}

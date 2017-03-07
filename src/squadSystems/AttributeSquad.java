package squadSystems;

import java.awt.Point;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import unitSystems.IUnit;
import utilitySystems.AttributeValue;

public class AttributeSquad extends SquadBase{
	/**
	 * This map holds the modifier value for each attribute<br>
	 * if an attribute is not present in the map then it remains unmodified
	 */
	private Map<AttributeType,Double> attributes;

	/**
	 * This Class is a squad that can be modified by units through the use of attributes
	 * @param units The units in the squad
	 * @param pos position of the squad
	 */
	public AttributeSquad(List<IUnit> units, Point pos) {
		super(units, pos);
		attributes = new HashMap<>();
		for(IUnit x: units){
			AttributeValue attr = x.getAttribute();
			if(x != null){
				addAttribute(attr);
			}
		}
	}
	
	/**
	 * Adds an attribute to the squad TODO might be public later
	 * @param attr the attribute to add
	 */
	private void addAttribute(AttributeValue attr){
		AttributeType type = attr.getType();
		if(attributes.containsKey(type)){
			attributes.put(type, attributes.get(type)+attr.getValue());
		}else{
			attributes.put(type, attr.getValue());
		}
	}
}

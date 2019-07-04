/*
 * generated by XText 2.18.0.M3
 */
package prodest.es.gov.br.dsl.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class NestDslGrammarAccess extends AbstractGrammarElementFinder {
	
	public class DomainmodelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "prodest.es.gov.br.dsl.NestDsl.Domainmodel");
		private final Assignment cElementsAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cElementsAbstractElementParserRuleCall_0 = (RuleCall)cElementsAssignment.eContents().get(0);
		
		//Domainmodel:
		//	elements+=AbstractElement*;
		@Override public ParserRule getRule() { return rule; }
		
		//elements+=AbstractElement*
		public Assignment getElementsAssignment() { return cElementsAssignment; }
		
		//AbstractElement
		public RuleCall getElementsAbstractElementParserRuleCall_0() { return cElementsAbstractElementParserRuleCall_0; }
	}
	public class AbstractElementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "prodest.es.gov.br.dsl.NestDsl.AbstractElement");
		private final RuleCall cTypeParserRuleCall = (RuleCall)rule.eContents().get(1);
		
		//AbstractElement:
		//	Type;
		@Override public ParserRule getRule() { return rule; }
		
		//Type
		public RuleCall getTypeParserRuleCall() { return cTypeParserRuleCall; }
	}
	public class EntityElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "prodest.es.gov.br.dsl.NestDsl.Entity");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cEntityKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cExtendsKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cSuperTypeAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final CrossReference cSuperTypeEntityCrossReference_2_1_0 = (CrossReference)cSuperTypeAssignment_2_1.eContents().get(0);
		private final RuleCall cSuperTypeEntityQualifiedNameParserRuleCall_2_1_0_1 = (RuleCall)cSuperTypeEntityCrossReference_2_1_0.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cPropertiesAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cPropertiesPropertyParserRuleCall_4_0 = (RuleCall)cPropertiesAssignment_4.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//Entity:
		//	'entity' name=ID ('extends' superType=[Entity|QualifiedName])? '{' properties+=Property* '}';
		@Override public ParserRule getRule() { return rule; }
		
		//'entity' name=ID ('extends' superType=[Entity|QualifiedName])? '{' properties+=Property* '}'
		public Group getGroup() { return cGroup; }
		
		//'entity'
		public Keyword getEntityKeyword_0() { return cEntityKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//('extends' superType=[Entity|QualifiedName])?
		public Group getGroup_2() { return cGroup_2; }
		
		//'extends'
		public Keyword getExtendsKeyword_2_0() { return cExtendsKeyword_2_0; }
		
		//superType=[Entity|QualifiedName]
		public Assignment getSuperTypeAssignment_2_1() { return cSuperTypeAssignment_2_1; }
		
		//[Entity|QualifiedName]
		public CrossReference getSuperTypeEntityCrossReference_2_1_0() { return cSuperTypeEntityCrossReference_2_1_0; }
		
		//QualifiedName
		public RuleCall getSuperTypeEntityQualifiedNameParserRuleCall_2_1_0_1() { return cSuperTypeEntityQualifiedNameParserRuleCall_2_1_0_1; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }
		
		//properties+=Property*
		public Assignment getPropertiesAssignment_4() { return cPropertiesAssignment_4; }
		
		//Property
		public RuleCall getPropertiesPropertyParserRuleCall_4_0() { return cPropertiesPropertyParserRuleCall_4_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }
	}
	public class TypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "prodest.es.gov.br.dsl.NestDsl.Type");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cDataTypeParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cEntityParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//Type:
		//	DataType | Entity;
		@Override public ParserRule getRule() { return rule; }
		
		//DataType | Entity
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//DataType
		public RuleCall getDataTypeParserRuleCall_0() { return cDataTypeParserRuleCall_0; }
		
		//Entity
		public RuleCall getEntityParserRuleCall_1() { return cEntityParserRuleCall_1; }
	}
	public class DataTypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "prodest.es.gov.br.dsl.NestDsl.DataType");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cTypeKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftSquareBracketRightSquareBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cSemicolonKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//DataType:
		//	'type' name=ID '[]'? ';'?;
		@Override public ParserRule getRule() { return rule; }
		
		//'type' name=ID '[]'? ';'?
		public Group getGroup() { return cGroup; }
		
		//'type'
		public Keyword getTypeKeyword_0() { return cTypeKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'[]'?
		public Keyword getLeftSquareBracketRightSquareBracketKeyword_2() { return cLeftSquareBracketRightSquareBracketKeyword_2; }
		
		//';'?
		public Keyword getSemicolonKeyword_3() { return cSemicolonKeyword_3; }
	}
	public class QualifiedNameElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "prodest.es.gov.br.dsl.NestDsl.QualifiedName");
		private final RuleCall cIDTerminalRuleCall = (RuleCall)rule.eContents().get(1);
		
		//QualifiedName:
		//	ID;
		@Override public ParserRule getRule() { return rule; }
		
		//ID
		public RuleCall getIDTerminalRuleCall() { return cIDTerminalRuleCall; }
	}
	public class PropertyElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "prodest.es.gov.br.dsl.NestDsl.Property");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cRelationAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cRelationRelationParserRuleCall_0_0 = (RuleCall)cRelationAssignment_0.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cColonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cTypeAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final CrossReference cTypeTypeCrossReference_3_0 = (CrossReference)cTypeAssignment_3.eContents().get(0);
		private final RuleCall cTypeTypeQualifiedNameParserRuleCall_3_0_1 = (RuleCall)cTypeTypeCrossReference_3_0.eContents().get(1);
		private final Assignment cArrayAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final Keyword cArrayLeftSquareBracketRightSquareBracketKeyword_4_0 = (Keyword)cArrayAssignment_4.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//Property:
		//	relation=Relation? name=ID ':' type=[Type|QualifiedName] array='[]'? ';'?;
		@Override public ParserRule getRule() { return rule; }
		
		//relation=Relation? name=ID ':' type=[Type|QualifiedName] array='[]'? ';'?
		public Group getGroup() { return cGroup; }
		
		//relation=Relation?
		public Assignment getRelationAssignment_0() { return cRelationAssignment_0; }
		
		//Relation
		public RuleCall getRelationRelationParserRuleCall_0_0() { return cRelationRelationParserRuleCall_0_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//':'
		public Keyword getColonKeyword_2() { return cColonKeyword_2; }
		
		//type=[Type|QualifiedName]
		public Assignment getTypeAssignment_3() { return cTypeAssignment_3; }
		
		//[Type|QualifiedName]
		public CrossReference getTypeTypeCrossReference_3_0() { return cTypeTypeCrossReference_3_0; }
		
		//QualifiedName
		public RuleCall getTypeTypeQualifiedNameParserRuleCall_3_0_1() { return cTypeTypeQualifiedNameParserRuleCall_3_0_1; }
		
		//array='[]'?
		public Assignment getArrayAssignment_4() { return cArrayAssignment_4; }
		
		//'[]'
		public Keyword getArrayLeftSquareBracketRightSquareBracketKeyword_4_0() { return cArrayLeftSquareBracketRightSquareBracketKeyword_4_0; }
		
		//';'?
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
	}
	public class RelationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "prodest.es.gov.br.dsl.NestDsl.Relation");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Assignment cOneArgumentAssignment_0 = (Assignment)cAlternatives.eContents().get(0);
		private final RuleCall cOneArgumentOneArgumentRelationParserRuleCall_0_0 = (RuleCall)cOneArgumentAssignment_0.eContents().get(0);
		private final Assignment cMultipleArgumentAssignment_1 = (Assignment)cAlternatives.eContents().get(1);
		private final RuleCall cMultipleArgumentMultipleArgumentRelationParserRuleCall_1_0 = (RuleCall)cMultipleArgumentAssignment_1.eContents().get(0);
		
		//Relation:
		//	oneArgument=OneArgumentRelation | multipleArgument=MultipleArgumentRelation;
		@Override public ParserRule getRule() { return rule; }
		
		//oneArgument=OneArgumentRelation | multipleArgument=MultipleArgumentRelation
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//oneArgument=OneArgumentRelation
		public Assignment getOneArgumentAssignment_0() { return cOneArgumentAssignment_0; }
		
		//OneArgumentRelation
		public RuleCall getOneArgumentOneArgumentRelationParserRuleCall_0_0() { return cOneArgumentOneArgumentRelationParserRuleCall_0_0; }
		
		//multipleArgument=MultipleArgumentRelation
		public Assignment getMultipleArgumentAssignment_1() { return cMultipleArgumentAssignment_1; }
		
		//MultipleArgumentRelation
		public RuleCall getMultipleArgumentMultipleArgumentRelationParserRuleCall_1_0() { return cMultipleArgumentMultipleArgumentRelationParserRuleCall_1_0; }
	}
	public class OneArgumentRelationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "prodest.es.gov.br.dsl.NestDsl.OneArgumentRelation");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cArgumentAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final Alternatives cArgumentAlternatives_0_0 = (Alternatives)cArgumentAssignment_0.eContents().get(0);
		private final Keyword cArgumentOneToOneKeyword_0_0_0 = (Keyword)cArgumentAlternatives_0_0.eContents().get(0);
		private final Keyword cArgumentManyToManyKeyword_0_0_1 = (Keyword)cArgumentAlternatives_0_0.eContents().get(1);
		private final Assignment cTypeAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cTypeEntityCrossReference_1_0 = (CrossReference)cTypeAssignment_1.eContents().get(0);
		private final RuleCall cTypeEntityIDTerminalRuleCall_1_0_1 = (RuleCall)cTypeEntityCrossReference_1_0.eContents().get(1);
		
		//OneArgumentRelation:
		//	argument=('OneToOne' | 'ManyToMany') type=[Entity];
		@Override public ParserRule getRule() { return rule; }
		
		//argument=('OneToOne' | 'ManyToMany') type=[Entity]
		public Group getGroup() { return cGroup; }
		
		//argument=('OneToOne' | 'ManyToMany')
		public Assignment getArgumentAssignment_0() { return cArgumentAssignment_0; }
		
		//('OneToOne' | 'ManyToMany')
		public Alternatives getArgumentAlternatives_0_0() { return cArgumentAlternatives_0_0; }
		
		//'OneToOne'
		public Keyword getArgumentOneToOneKeyword_0_0_0() { return cArgumentOneToOneKeyword_0_0_0; }
		
		//'ManyToMany'
		public Keyword getArgumentManyToManyKeyword_0_0_1() { return cArgumentManyToManyKeyword_0_0_1; }
		
		//type=[Entity]
		public Assignment getTypeAssignment_1() { return cTypeAssignment_1; }
		
		//[Entity]
		public CrossReference getTypeEntityCrossReference_1_0() { return cTypeEntityCrossReference_1_0; }
		
		//ID
		public RuleCall getTypeEntityIDTerminalRuleCall_1_0_1() { return cTypeEntityIDTerminalRuleCall_1_0_1; }
	}
	public class MultipleArgumentRelationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "prodest.es.gov.br.dsl.NestDsl.MultipleArgumentRelation");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cArgumentAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final Alternatives cArgumentAlternatives_0_0 = (Alternatives)cArgumentAssignment_0.eContents().get(0);
		private final Keyword cArgumentManyToOneKeyword_0_0_0 = (Keyword)cArgumentAlternatives_0_0.eContents().get(0);
		private final Keyword cArgumentOneToManyKeyword_0_0_1 = (Keyword)cArgumentAlternatives_0_0.eContents().get(1);
		private final Assignment cTypeAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cTypeEntityCrossReference_1_0 = (CrossReference)cTypeAssignment_1.eContents().get(0);
		private final RuleCall cTypeEntityIDTerminalRuleCall_1_0_1 = (RuleCall)cTypeEntityCrossReference_1_0.eContents().get(1);
		private final Keyword cCommaKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cSecondArgumentAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cSecondArgumentARGUMENTREGEXTerminalRuleCall_3_0 = (RuleCall)cSecondArgumentAssignment_3.eContents().get(0);
		
		//MultipleArgumentRelation:
		//	argument=('ManyToOne' | 'OneToMany') type=[Entity] ',' secondArgument=ARGUMENTREGEX;
		@Override public ParserRule getRule() { return rule; }
		
		//argument=('ManyToOne' | 'OneToMany') type=[Entity] ',' secondArgument=ARGUMENTREGEX
		public Group getGroup() { return cGroup; }
		
		//argument=('ManyToOne' | 'OneToMany')
		public Assignment getArgumentAssignment_0() { return cArgumentAssignment_0; }
		
		//('ManyToOne' | 'OneToMany')
		public Alternatives getArgumentAlternatives_0_0() { return cArgumentAlternatives_0_0; }
		
		//'ManyToOne'
		public Keyword getArgumentManyToOneKeyword_0_0_0() { return cArgumentManyToOneKeyword_0_0_0; }
		
		//'OneToMany'
		public Keyword getArgumentOneToManyKeyword_0_0_1() { return cArgumentOneToManyKeyword_0_0_1; }
		
		//type=[Entity]
		public Assignment getTypeAssignment_1() { return cTypeAssignment_1; }
		
		//[Entity]
		public CrossReference getTypeEntityCrossReference_1_0() { return cTypeEntityCrossReference_1_0; }
		
		//ID
		public RuleCall getTypeEntityIDTerminalRuleCall_1_0_1() { return cTypeEntityIDTerminalRuleCall_1_0_1; }
		
		//','
		public Keyword getCommaKeyword_2() { return cCommaKeyword_2; }
		
		//secondArgument=ARGUMENTREGEX
		public Assignment getSecondArgumentAssignment_3() { return cSecondArgumentAssignment_3; }
		
		//ARGUMENTREGEX
		public RuleCall getSecondArgumentARGUMENTREGEXTerminalRuleCall_3_0() { return cSecondArgumentARGUMENTREGEXTerminalRuleCall_3_0; }
	}
	
	
	private final DomainmodelElements pDomainmodel;
	private final AbstractElementElements pAbstractElement;
	private final EntityElements pEntity;
	private final TypeElements pType;
	private final DataTypeElements pDataType;
	private final QualifiedNameElements pQualifiedName;
	private final PropertyElements pProperty;
	private final RelationElements pRelation;
	private final OneArgumentRelationElements pOneArgumentRelation;
	private final MultipleArgumentRelationElements pMultipleArgumentRelation;
	private final TerminalRule tARGUMENTREGEX;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public NestDslGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pDomainmodel = new DomainmodelElements();
		this.pAbstractElement = new AbstractElementElements();
		this.pEntity = new EntityElements();
		this.pType = new TypeElements();
		this.pDataType = new DataTypeElements();
		this.pQualifiedName = new QualifiedNameElements();
		this.pProperty = new PropertyElements();
		this.pRelation = new RelationElements();
		this.pOneArgumentRelation = new OneArgumentRelationElements();
		this.pMultipleArgumentRelation = new MultipleArgumentRelationElements();
		this.tARGUMENTREGEX = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "prodest.es.gov.br.dsl.NestDsl.ARGUMENTREGEX");
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("prodest.es.gov.br.dsl.NestDsl".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Domainmodel:
	//	elements+=AbstractElement*;
	public DomainmodelElements getDomainmodelAccess() {
		return pDomainmodel;
	}
	
	public ParserRule getDomainmodelRule() {
		return getDomainmodelAccess().getRule();
	}
	
	//AbstractElement:
	//	Type;
	public AbstractElementElements getAbstractElementAccess() {
		return pAbstractElement;
	}
	
	public ParserRule getAbstractElementRule() {
		return getAbstractElementAccess().getRule();
	}
	
	//Entity:
	//	'entity' name=ID ('extends' superType=[Entity|QualifiedName])? '{' properties+=Property* '}';
	public EntityElements getEntityAccess() {
		return pEntity;
	}
	
	public ParserRule getEntityRule() {
		return getEntityAccess().getRule();
	}
	
	//Type:
	//	DataType | Entity;
	public TypeElements getTypeAccess() {
		return pType;
	}
	
	public ParserRule getTypeRule() {
		return getTypeAccess().getRule();
	}
	
	//DataType:
	//	'type' name=ID '[]'? ';'?;
	public DataTypeElements getDataTypeAccess() {
		return pDataType;
	}
	
	public ParserRule getDataTypeRule() {
		return getDataTypeAccess().getRule();
	}
	
	//QualifiedName:
	//	ID;
	public QualifiedNameElements getQualifiedNameAccess() {
		return pQualifiedName;
	}
	
	public ParserRule getQualifiedNameRule() {
		return getQualifiedNameAccess().getRule();
	}
	
	//Property:
	//	relation=Relation? name=ID ':' type=[Type|QualifiedName] array='[]'? ';'?;
	public PropertyElements getPropertyAccess() {
		return pProperty;
	}
	
	public ParserRule getPropertyRule() {
		return getPropertyAccess().getRule();
	}
	
	//Relation:
	//	oneArgument=OneArgumentRelation | multipleArgument=MultipleArgumentRelation;
	public RelationElements getRelationAccess() {
		return pRelation;
	}
	
	public ParserRule getRelationRule() {
		return getRelationAccess().getRule();
	}
	
	//OneArgumentRelation:
	//	argument=('OneToOne' | 'ManyToMany') type=[Entity];
	public OneArgumentRelationElements getOneArgumentRelationAccess() {
		return pOneArgumentRelation;
	}
	
	public ParserRule getOneArgumentRelationRule() {
		return getOneArgumentRelationAccess().getRule();
	}
	
	//MultipleArgumentRelation:
	//	argument=('ManyToOne' | 'OneToMany') type=[Entity] ',' secondArgument=ARGUMENTREGEX;
	public MultipleArgumentRelationElements getMultipleArgumentRelationAccess() {
		return pMultipleArgumentRelation;
	}
	
	public ParserRule getMultipleArgumentRelationRule() {
		return getMultipleArgumentRelationAccess().getRule();
	}
	
	//terminal ARGUMENTREGEX:
	//	ID ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getARGUMENTREGEXRule() {
		return tARGUMENTREGEX;
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' | "'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/*'->'*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}

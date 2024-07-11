/*
 * generated by Xtext 2.32.0
 */
package org.xtext.example.mydsl1.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.xtext.example.mydsl1.ide.contentassist.antlr.internal.InternalMyDslParser;
import org.xtext.example.mydsl1.services.MyDslGrammarAccess;

public class MyDslParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(MyDslGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, MyDslGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getCollectionFieldDefinationAccess().getAlternatives(), "rule__CollectionFieldDefination__Alternatives");
			builder.put(grammarAccess.getCRUDOperationsAccess().getAlternatives(), "rule__CRUDOperations__Alternatives");
			builder.put(grammarAccess.getUpdateCollectionEntryAccess().getAlternatives_2(), "rule__UpdateCollectionEntry__Alternatives_2");
			builder.put(grammarAccess.getCollectionEntryAccess().getAlternatives_2(), "rule__CollectionEntry__Alternatives_2");
			builder.put(grammarAccess.getOperationAccess().getAlternatives(), "rule__Operation__Alternatives");
			builder.put(grammarAccess.getFieldTypeAccess().getAlternatives(), "rule__FieldType__Alternatives");
			builder.put(grammarAccess.getModelAccess().getGroup(), "rule__Model__Group__0");
			builder.put(grammarAccess.getCRUDOperationAndCollectionSchemaAccess().getGroup(), "rule__CRUDOperationAndCollectionSchema__Group__0");
			builder.put(grammarAccess.getConnectionStatementAccess().getGroup_0(), "rule__ConnectionStatement__Group_0__0");
			builder.put(grammarAccess.getConnectionStatementAccess().getGroup_1(), "rule__ConnectionStatement__Group_1__0");
			builder.put(grammarAccess.getCollectionSchemaAccess().getGroup(), "rule__CollectionSchema__Group__0");
			builder.put(grammarAccess.getCollectionSchemaAccess().getGroup_3(), "rule__CollectionSchema__Group_3__0");
			builder.put(grammarAccess.getCollectionSchemaAccess().getGroup_3_1(), "rule__CollectionSchema__Group_3_1__0");
			builder.put(grammarAccess.getCollectionFieldDefinationAccess().getGroup_0(), "rule__CollectionFieldDefination__Group_0__0");
			builder.put(grammarAccess.getCollectionFieldDefinationAccess().getGroup_1(), "rule__CollectionFieldDefination__Group_1__0");
			builder.put(grammarAccess.getCRUDOperationsAccess().getGroup_0(), "rule__CRUDOperations__Group_0__0");
			builder.put(grammarAccess.getCRUDOperationsAccess().getGroup_0_3(), "rule__CRUDOperations__Group_0_3__0");
			builder.put(grammarAccess.getCRUDOperationsAccess().getGroup_0_3_8(), "rule__CRUDOperations__Group_0_3_8__0");
			builder.put(grammarAccess.getCRUDOperationsAccess().getGroup_0_3_8_1(), "rule__CRUDOperations__Group_0_3_8_1__0");
			builder.put(grammarAccess.getCRUDOperationsAccess().getGroup_1(), "rule__CRUDOperations__Group_1__0");
			builder.put(grammarAccess.getCRUDOperationsAccess().getGroup_1_3(), "rule__CRUDOperations__Group_1_3__0");
			builder.put(grammarAccess.getCRUDOperationsAccess().getGroup_1_3_8(), "rule__CRUDOperations__Group_1_3_8__0");
			builder.put(grammarAccess.getCRUDOperationsAccess().getGroup_1_3_13(), "rule__CRUDOperations__Group_1_3_13__0");
			builder.put(grammarAccess.getUpdateCollectionEntryAccess().getGroup(), "rule__UpdateCollectionEntry__Group__0");
			builder.put(grammarAccess.getCollectionEntryAccess().getGroup(), "rule__CollectionEntry__Group__0");
			builder.put(grammarAccess.getMongoDBAccess().getModelsAssignment(), "rule__MongoDB__ModelsAssignment");
			builder.put(grammarAccess.getModelAccess().getConnectionAssignment_0(), "rule__Model__ConnectionAssignment_0");
			builder.put(grammarAccess.getModelAccess().getStatementsAssignment_1(), "rule__Model__StatementsAssignment_1");
			builder.put(grammarAccess.getCRUDOperationAndCollectionSchemaAccess().getSchemaAssignment_0(), "rule__CRUDOperationAndCollectionSchema__SchemaAssignment_0");
			builder.put(grammarAccess.getCRUDOperationAndCollectionSchemaAccess().getOperationsAssignment_1(), "rule__CRUDOperationAndCollectionSchema__OperationsAssignment_1");
			builder.put(grammarAccess.getConnectionStatementAccess().getConnectionStringAssignment_0_3(), "rule__ConnectionStatement__ConnectionStringAssignment_0_3");
			builder.put(grammarAccess.getConnectionStatementAccess().getDatabaseNameAssignment_1_1(), "rule__ConnectionStatement__DatabaseNameAssignment_1_1");
			builder.put(grammarAccess.getCollectionSchemaAccess().getNameAssignment_1(), "rule__CollectionSchema__NameAssignment_1");
			builder.put(grammarAccess.getCollectionSchemaAccess().getDefinationAssignment_3_0(), "rule__CollectionSchema__DefinationAssignment_3_0");
			builder.put(grammarAccess.getCollectionSchemaAccess().getDefinationAssignment_3_1_1(), "rule__CollectionSchema__DefinationAssignment_3_1_1");
			builder.put(grammarAccess.getCollectionFieldDefinationAccess().getNameAssignment_0_0(), "rule__CollectionFieldDefination__NameAssignment_0_0");
			builder.put(grammarAccess.getCollectionFieldDefinationAccess().getFieldTypeAssignment_0_2(), "rule__CollectionFieldDefination__FieldTypeAssignment_0_2");
			builder.put(grammarAccess.getCollectionFieldDefinationAccess().getStatusAssignment_0_3(), "rule__CollectionFieldDefination__StatusAssignment_0_3");
			builder.put(grammarAccess.getCollectionFieldDefinationAccess().getUniqueKeyAssignment_0_4(), "rule__CollectionFieldDefination__UniqueKeyAssignment_0_4");
			builder.put(grammarAccess.getCollectionFieldDefinationAccess().getNameAssignment_1_0(), "rule__CollectionFieldDefination__NameAssignment_1_0");
			builder.put(grammarAccess.getCollectionFieldDefinationAccess().getRefCollectionAssignment_1_3(), "rule__CollectionFieldDefination__RefCollectionAssignment_1_3");
			builder.put(grammarAccess.getCRUDOperationsAccess().getNameAssignment_0_1(), "rule__CRUDOperations__NameAssignment_0_1");
			builder.put(grammarAccess.getCRUDOperationsAccess().getTypeAssignment_0_3_2(), "rule__CRUDOperations__TypeAssignment_0_3_2");
			builder.put(grammarAccess.getCRUDOperationsAccess().getCollectionAssignment_0_3_5(), "rule__CRUDOperations__CollectionAssignment_0_3_5");
			builder.put(grammarAccess.getCRUDOperationsAccess().getEntriesAssignment_0_3_8_0(), "rule__CRUDOperations__EntriesAssignment_0_3_8_0");
			builder.put(grammarAccess.getCRUDOperationsAccess().getEntriesAssignment_0_3_8_1_1(), "rule__CRUDOperations__EntriesAssignment_0_3_8_1_1");
			builder.put(grammarAccess.getCRUDOperationsAccess().getNameAssignment_1_1(), "rule__CRUDOperations__NameAssignment_1_1");
			builder.put(grammarAccess.getCRUDOperationsAccess().getTypeAssignment_1_3_2(), "rule__CRUDOperations__TypeAssignment_1_3_2");
			builder.put(grammarAccess.getCRUDOperationsAccess().getCollectionAssignment_1_3_4(), "rule__CRUDOperations__CollectionAssignment_1_3_4");
			builder.put(grammarAccess.getCRUDOperationsAccess().getEntriesAssignment_1_3_7(), "rule__CRUDOperations__EntriesAssignment_1_3_7");
			builder.put(grammarAccess.getCRUDOperationsAccess().getEntriesAssignment_1_3_8_1(), "rule__CRUDOperations__EntriesAssignment_1_3_8_1");
			builder.put(grammarAccess.getCRUDOperationsAccess().getEntriesAssignment_1_3_12(), "rule__CRUDOperations__EntriesAssignment_1_3_12");
			builder.put(grammarAccess.getCRUDOperationsAccess().getEntriesAssignment_1_3_13_1(), "rule__CRUDOperations__EntriesAssignment_1_3_13_1");
			builder.put(grammarAccess.getUpdateCollectionEntryAccess().getValueNameAssignment_0(), "rule__UpdateCollectionEntry__ValueNameAssignment_0");
			builder.put(grammarAccess.getUpdateCollectionEntryAccess().getValueStringAssignment_2_0(), "rule__UpdateCollectionEntry__ValueStringAssignment_2_0");
			builder.put(grammarAccess.getUpdateCollectionEntryAccess().getValueIntAssignment_2_1(), "rule__UpdateCollectionEntry__ValueIntAssignment_2_1");
			builder.put(grammarAccess.getCollectionEntryAccess().getValueNameAssignment_0(), "rule__CollectionEntry__ValueNameAssignment_0");
			builder.put(grammarAccess.getCollectionEntryAccess().getValueStringAssignment_2_0(), "rule__CollectionEntry__ValueStringAssignment_2_0");
			builder.put(grammarAccess.getCollectionEntryAccess().getValueIntAssignment_2_1(), "rule__CollectionEntry__ValueIntAssignment_2_1");
			builder.put(grammarAccess.getConnectionStatementAccess().getUnorderedGroup(), "rule__ConnectionStatement__UnorderedGroup");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private MyDslGrammarAccess grammarAccess;

	@Override
	protected InternalMyDslParser createParser() {
		InternalMyDslParser result = new InternalMyDslParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public MyDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}

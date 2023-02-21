package de.hybris.merchandise.core.search.solrfacetsearch.resolver;

import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.solrfacetsearch.config.IndexedProperty;
import de.hybris.platform.solrfacetsearch.config.exceptions.FieldValueProviderException;
import de.hybris.platform.solrfacetsearch.indexer.IndexerBatchContext;
import de.hybris.platform.solrfacetsearch.indexer.spi.InputDocument;
import de.hybris.platform.solrfacetsearch.provider.ValueResolver;

import java.util.Collection;

public class InternalProductResolver implements ValueResolver<ProductModel> {
    @Override
    public void resolve(final InputDocument inputDocument, final IndexerBatchContext indexerBatchContext,
                        final Collection<IndexedProperty> indexedProperties, final ProductModel productModel)
            throws FieldValueProviderException {

        for (final IndexedProperty indexedProperty : indexedProperties) {
            boolean internalOnly = Boolean.TRUE.equals(productModel.getInternalOnly());
            inputDocument.addField(indexedProperty, internalOnly);
        }
    }
}

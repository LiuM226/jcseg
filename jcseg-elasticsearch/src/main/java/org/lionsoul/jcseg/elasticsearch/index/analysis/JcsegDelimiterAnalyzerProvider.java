package org.lionsoul.jcseg.elasticsearch.index.analysis;

import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.env.Environment;
import org.elasticsearch.index.IndexSettings;
import org.lionsoul.jcseg.tokenizer.core.JcsegTaskConfig;

/**
 * Jcseg simple Analyzer Provider
 * 
 * @author chenxin<chenxin619315@gmail.com>
 */
public class JcsegDelimiterAnalyzerProvider extends JcsegAnalyzerProvider
{
    public JcsegDelimiterAnalyzerProvider(IndexSettings indexSettings,
            Environment env, String name, Settings settings)
    {
        super(indexSettings, env, name, settings);
    }

    @Override
    protected int getSegMode()
    {
        return JcsegTaskConfig.DELIMITER_MODE;
    }
    
}

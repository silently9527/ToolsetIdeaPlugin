package cn.silently9527.listener.action;

import cn.silently9527.notification.ToolkitNotifier;
import cn.silently9527.utils.SystemUtils;
import com.intellij.ui.EditorTextField;
import org.apache.commons.lang3.StringUtils;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * CopyContentAction
 */
public class CopyContentActionListener implements ActionListener {
    private EditorTextField editorTextField;

    public CopyContentActionListener(EditorTextField editorTextField) {
        this.editorTextField = editorTextField;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String editorContent = editorTextField.getText();

        if (StringUtils.isNotBlank(editorContent)) {
            SystemUtils.copyToClipboard(editorContent);
            ToolkitNotifier.success("Copy content to Clipboard success.");
        }
    }
}

/*
 * Copyright (C) 2009 Christopho, Zelda Solarus - http://www.zelda-solarus.com
 *
 * Zelda: Mystery of Solarus DX is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Zelda: Mystery of Solarus DX is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License along
 * with this program. If not, see <http://www.gnu.org/licenses/>.
 */

package org.solarus.editor.gui;

import java.util.Observer;
import javax.swing.JInternalFrame;
import org.solarus.editor.ProjectObserver;

/**
 * Main window of an editor. Every editor (map, langages, tileset ...) will extends this class
 */
public abstract class AbstractEditorWindow extends JInternalFrame implements Observer, ProjectObserver {


    public abstract boolean checkCurrentFileSaved();

}
// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.actions.operations

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val WorkspaceImport: ImageVector
  get() {
    val current = _workspaceImport
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.WorkspaceImport",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M27 6 v5 H17 V6z m0 -2 H17 a2 2 0 0 0 -2 2 v5 a2 2 0 0 0 2 2 h10 a2 2 0 0 0 2 -2 V6 a2 2 0 0 0 -2 -2 M12 25 H6 v-8 h6 v-2 H6 a2 2 0 0 0 -2 2 v8 a2 2 0 0 0 2 2 h6Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 27 6
          moveTo(x = 27.0f, y = 6.0f)
          // v 5
          verticalLineToRelative(dy = 5.0f)
          // H 17
          horizontalLineTo(x = 17.0f)
          // V 6z
          verticalLineTo(y = 6.0f)
          close()
          // m 0 -2
          moveToRelative(dx = 0.0f, dy = -2.0f)
          // H 17
          horizontalLineTo(x = 17.0f)
          // a 2 2 0 0 0 -2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.0f,
            dy1 = 2.0f,
          )
          // v 5
          verticalLineToRelative(dy = 5.0f)
          // a 2 2 0 0 0 2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 2.0f,
            dy1 = 2.0f,
          )
          // h 10
          horizontalLineToRelative(dx = 10.0f)
          // a 2 2 0 0 0 2 -2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 2.0f,
            dy1 = -2.0f,
          )
          // V 6
          verticalLineTo(y = 6.0f)
          // a 2 2 0 0 0 -2 -2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.0f,
            dy1 = -2.0f,
          )
          // M 12 25
          moveTo(x = 12.0f, y = 25.0f)
          // H 6
          horizontalLineTo(x = 6.0f)
          // v -8
          verticalLineToRelative(dy = -8.0f)
          // h 6
          horizontalLineToRelative(dx = 6.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // H 6
          horizontalLineTo(x = 6.0f)
          // a 2 2 0 0 0 -2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.0f,
            dy1 = 2.0f,
          )
          // v 8
          verticalLineToRelative(dy = 8.0f)
          // a 2 2 0 0 0 2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 2.0f,
            dy1 = 2.0f,
          )
          // h 6z
          horizontalLineToRelative(dx = 6.0f)
          close()
        }
        // <polygon points="30.0 20.0 16.828 20.0 19.414 17.414 18.0 16.0 13.0 21.0 18.0 26.0 19.414 24.586 16.828 22.0 30.0 22.0 30.0 20.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 30 20
          moveTo(x = 30.0f, y = 20.0f)
          // L 16.828 20
          lineTo(x = 16.828f, y = 20.0f)
          // L 19.414 17.414
          lineTo(x = 19.414f, y = 17.414f)
          // L 18 16
          lineTo(x = 18.0f, y = 16.0f)
          // L 13 21
          lineTo(x = 13.0f, y = 21.0f)
          // L 18 26
          lineTo(x = 18.0f, y = 26.0f)
          // L 19.414 24.586
          lineTo(x = 19.414f, y = 24.586f)
          // L 16.828 22
          lineTo(x = 16.828f, y = 22.0f)
          // L 30 22
          lineTo(x = 30.0f, y = 22.0f)
          // L 30 20z
          lineTo(x = 30.0f, y = 20.0f)
          close()
        }
        // M11 6 v5 H6 V6z m0 -2 H6 a2 2 0 0 0 -2 2 v5 a2 2 0 0 0 2 2 h5 a2 2 0 0 0 2 -2 V6 a2 2 0 0 0 -2 -2
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 11 6
          moveTo(x = 11.0f, y = 6.0f)
          // v 5
          verticalLineToRelative(dy = 5.0f)
          // H 6
          horizontalLineTo(x = 6.0f)
          // V 6z
          verticalLineTo(y = 6.0f)
          close()
          // m 0 -2
          moveToRelative(dx = 0.0f, dy = -2.0f)
          // H 6
          horizontalLineTo(x = 6.0f)
          // a 2 2 0 0 0 -2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.0f,
            dy1 = 2.0f,
          )
          // v 5
          verticalLineToRelative(dy = 5.0f)
          // a 2 2 0 0 0 2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 2.0f,
            dy1 = 2.0f,
          )
          // h 5
          horizontalLineToRelative(dx = 5.0f)
          // a 2 2 0 0 0 2 -2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 2.0f,
            dy1 = -2.0f,
          )
          // V 6
          verticalLineTo(y = 6.0f)
          // a 2 2 0 0 0 -2 -2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.0f,
            dy1 = -2.0f,
          )
        }
        // <rect width="32" height="32" fill="#000" style="fill:none" />
        path(
          fill = SolidColor(Color.Transparent),
        ) {
          // M 0 0
          moveTo(x = 0.0f, y = 0.0f)
          // h 32
          horizontalLineToRelative(dx = 32.0f)
          // v 32
          verticalLineToRelative(dy = 32.0f)
          // h -32z
          horizontalLineToRelative(dx = -32.0f)
          close()
        }
      }.build()
      .also { _workspaceImport = it }
  }

@Suppress("ObjectPropertyName")
private var _workspaceImport: ImageVector? = null

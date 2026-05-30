// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.actions.formatting

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val TrashCan: ImageVector
  get() {
    val current = _trashCan
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.TrashCan",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <rect width="2" height="12" x="12.0" y="12.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 12 12
          moveTo(x = 12.0f, y = 12.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 12
          verticalLineToRelative(dy = 12.0f)
          // h -2z
          horizontalLineToRelative(dx = -2.0f)
          close()
        }
        // <rect width="2" height="12" x="18.0" y="12.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 18 12
          moveTo(x = 18.0f, y = 12.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 12
          verticalLineToRelative(dy = 12.0f)
          // h -2z
          horizontalLineToRelative(dx = -2.0f)
          close()
        }
        // M4 6 v2 h2 v20 a2 2 0 0 0 2 2 h16 a2 2 0 0 0 2 -2 V8 h2 V6Z m4 22 V8 h16 v20Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 4 6
          moveTo(x = 4.0f, y = 6.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 20
          verticalLineToRelative(dy = 20.0f)
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
          // h 16
          horizontalLineToRelative(dx = 16.0f)
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
          // V 8
          verticalLineTo(y = 8.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // V 6z
          verticalLineTo(y = 6.0f)
          close()
          // m 4 22
          moveToRelative(dx = 4.0f, dy = 22.0f)
          // V 8
          verticalLineTo(y = 8.0f)
          // h 16
          horizontalLineToRelative(dx = 16.0f)
          // v 20z
          verticalLineToRelative(dy = 20.0f)
          close()
        }
        // <rect width="8" height="2" x="12.0" y="2.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 12 2
          moveTo(x = 12.0f, y = 2.0f)
          // h 8
          horizontalLineToRelative(dx = 8.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -8z
          horizontalLineToRelative(dx = -8.0f)
          close()
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
      .also { _trashCan = it }
  }

@Suppress("ObjectPropertyName")
private var _trashCan: ImageVector? = null

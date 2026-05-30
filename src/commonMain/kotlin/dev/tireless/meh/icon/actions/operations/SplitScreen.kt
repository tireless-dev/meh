// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.actions.operations

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SplitScreen: ImageVector
  get() {
    val current = _splitScreen
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.SplitScreen",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <rect width="2" height="24" x="15.0" y="4.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 15 4
          moveTo(x = 15.0f, y = 4.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 24
          verticalLineToRelative(dy = 24.0f)
          // h -2z
          horizontalLineToRelative(dx = -2.0f)
          close()
        }
        // M10 7 v18 H4 V7z m0 -2 H4 a2 2 0 0 0 -2 2 v18 a2 2 0 0 0 2 2 h6 a2 2 0 0 0 2 -2 V7 a2 2 0 0 0 -2 -2 m18 2 v18 h-6 V7z m0 -2 h-6 a2 2 0 0 0 -2 2 v18 a2 2 0 0 0 2 2 h6 a2 2 0 0 0 2 -2 V7 a2 2 0 0 0 -2 -2
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 10 7
          moveTo(x = 10.0f, y = 7.0f)
          // v 18
          verticalLineToRelative(dy = 18.0f)
          // H 4
          horizontalLineTo(x = 4.0f)
          // V 7z
          verticalLineTo(y = 7.0f)
          close()
          // m 0 -2
          moveToRelative(dx = 0.0f, dy = -2.0f)
          // H 4
          horizontalLineTo(x = 4.0f)
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
          // v 18
          verticalLineToRelative(dy = 18.0f)
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
          // h 6
          horizontalLineToRelative(dx = 6.0f)
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
          // V 7
          verticalLineTo(y = 7.0f)
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
          // m 18 2
          moveToRelative(dx = 18.0f, dy = 2.0f)
          // v 18
          verticalLineToRelative(dy = 18.0f)
          // h -6
          horizontalLineToRelative(dx = -6.0f)
          // V 7z
          verticalLineTo(y = 7.0f)
          close()
          // m 0 -2
          moveToRelative(dx = 0.0f, dy = -2.0f)
          // h -6
          horizontalLineToRelative(dx = -6.0f)
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
          // v 18
          verticalLineToRelative(dy = 18.0f)
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
          // h 6
          horizontalLineToRelative(dx = 6.0f)
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
          // V 7
          verticalLineTo(y = 7.0f)
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
      .also { _splitScreen = it }
  }

@Suppress("ObjectPropertyName")
private var _splitScreen: ImageVector? = null

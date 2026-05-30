// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.actions.formatting

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val TextSelection: ImageVector
  get() {
    val current = _textSelection
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.TextSelection",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M28 27 h-7 a3 3 0 0 1 -3 -3 v-2 a3 3 0 0 1 3 -3 h5 v-2 a1 1 0 0 0 -1 -1 h-6 v-2 h6 a3 3 0 0 1 3 3Z m-7 -6 a1 1 0 0 0 -1 1 v2 a1 1 0 0 0 1 1 h5 v-4Z M13 7 h3 V5 h-3 a4 4 0 0 0 -3 1.38 A4 4 0 0 0 7 5 H4 v2 h3 a2 2 0 0 1 2 2 v5 H5 v2 h4 v7 a2 2 0 0 1 -2 2 H4 v2 h3 a4 4 0 0 0 3 -1.38 A4 4 0 0 0 13 27 h3 v-2 h-3 a2 2 0 0 1 -2 -2 v-7 h4 v-2 h-4 V9 a2 2 0 0 1 2 -2
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 28 27
          moveTo(x = 28.0f, y = 27.0f)
          // h -7
          horizontalLineToRelative(dx = -7.0f)
          // a 3 3 0 0 1 -3 -3
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -3.0f,
            dy1 = -3.0f,
          )
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // a 3 3 0 0 1 3 -3
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 3.0f,
            dy1 = -3.0f,
          )
          // h 5
          horizontalLineToRelative(dx = 5.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // a 1 1 0 0 0 -1 -1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.0f,
            dy1 = -1.0f,
          )
          // h -6
          horizontalLineToRelative(dx = -6.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h 6
          horizontalLineToRelative(dx = 6.0f)
          // a 3 3 0 0 1 3 3z
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 3.0f,
            dy1 = 3.0f,
          )
          close()
          // m -7 -6
          moveToRelative(dx = -7.0f, dy = -6.0f)
          // a 1 1 0 0 0 -1 1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.0f,
            dy1 = 1.0f,
          )
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // a 1 1 0 0 0 1 1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 1.0f,
            dy1 = 1.0f,
          )
          // h 5
          horizontalLineToRelative(dx = 5.0f)
          // v -4z
          verticalLineToRelative(dy = -4.0f)
          close()
          // M 13 7
          moveTo(x = 13.0f, y = 7.0f)
          // h 3
          horizontalLineToRelative(dx = 3.0f)
          // V 5
          verticalLineTo(y = 5.0f)
          // h -3
          horizontalLineToRelative(dx = -3.0f)
          // a 4 4 0 0 0 -3 1.38
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -3.0f,
            dy1 = 1.38f,
          )
          // A 4 4 0 0 0 7 5
          arcTo(
            horizontalEllipseRadius = 4.0f,
            verticalEllipseRadius = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 7.0f,
            y1 = 5.0f,
          )
          // H 4
          horizontalLineTo(x = 4.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 3
          horizontalLineToRelative(dx = 3.0f)
          // a 2 2 0 0 1 2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 2.0f,
            dy1 = 2.0f,
          )
          // v 5
          verticalLineToRelative(dy = 5.0f)
          // H 5
          horizontalLineTo(x = 5.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v 7
          verticalLineToRelative(dy = 7.0f)
          // a 2 2 0 0 1 -2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -2.0f,
            dy1 = 2.0f,
          )
          // H 4
          horizontalLineTo(x = 4.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 3
          horizontalLineToRelative(dx = 3.0f)
          // a 4 4 0 0 0 3 -1.38
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 3.0f,
            dy1 = -1.38f,
          )
          // A 4 4 0 0 0 13 27
          arcTo(
            horizontalEllipseRadius = 4.0f,
            verticalEllipseRadius = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 13.0f,
            y1 = 27.0f,
          )
          // h 3
          horizontalLineToRelative(dx = 3.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h -3
          horizontalLineToRelative(dx = -3.0f)
          // a 2 2 0 0 1 -2 -2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -2.0f,
            dy1 = -2.0f,
          )
          // v -7
          verticalLineToRelative(dy = -7.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h -4
          horizontalLineToRelative(dx = -4.0f)
          // V 9
          verticalLineTo(y = 9.0f)
          // a 2 2 0 0 1 2 -2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 2.0f,
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
      .also { _textSelection = it }
  }

@Suppress("ObjectPropertyName")
private var _textSelection: ImageVector? = null

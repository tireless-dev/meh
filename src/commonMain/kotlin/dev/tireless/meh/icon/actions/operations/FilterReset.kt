// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.actions.operations

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FilterReset: ImageVector
  get() {
    val current = _filterReset
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.FilterReset",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M22.5 9 a7.5 7.5 0 0 0 -6.5 3.8 V8 h-2 v8 h8 v-2 h-4.38 a5.5 5.5 0 1 1 4.88 8 H22 v2 h.5 a7.5 7.5 0 0 0 0 -15
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 22.5 9
          moveTo(x = 22.5f, y = 9.0f)
          // a 7.5 7.5 0 0 0 -6.5 3.8
          arcToRelative(
            a = 7.5f,
            b = 7.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -6.5f,
            dy1 = 3.8f,
          )
          // V 8
          verticalLineTo(y = 8.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v 8
          verticalLineToRelative(dy = 8.0f)
          // h 8
          horizontalLineToRelative(dx = 8.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h -4.38
          horizontalLineToRelative(dx = -4.38f)
          // a 5.5 5.5 0 1 1 4.88 8
          arcToRelative(
            a = 5.5f,
            b = 5.5f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 4.88f,
            dy1 = 8.0f,
          )
          // H 22
          horizontalLineTo(x = 22.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 0.5
          horizontalLineToRelative(dx = 0.5f)
          // a 7.5 7.5 0 0 0 0 -15
          arcToRelative(
            a = 7.5f,
            b = 7.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = -15.0f,
          )
        }
        // M26 6 H4 v3.17 l7.41 7.42 .59 .58 V26 h4 v-2 h2 v2 a2 2 0 0 1 -2 2 h-4 a2 2 0 0 1 -2 -2 v-8 l-7.41 -7.41 A2 2 0 0 1 2 9.17 V6 a2 2 0 0 1 2 -2 h22Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 26 6
          moveTo(x = 26.0f, y = 6.0f)
          // H 4
          horizontalLineTo(x = 4.0f)
          // v 3.17
          verticalLineToRelative(dy = 3.17f)
          // l 7.41 7.42
          lineToRelative(dx = 7.41f, dy = 7.42f)
          // l 0.59 0.58
          lineToRelative(dx = 0.59f, dy = 0.58f)
          // V 26
          verticalLineTo(y = 26.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
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
          // h -4
          horizontalLineToRelative(dx = -4.0f)
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
          // v -8
          verticalLineToRelative(dy = -8.0f)
          // l -7.41 -7.41
          lineToRelative(dx = -7.41f, dy = -7.41f)
          // A 2 2 0 0 1 2 9.17
          arcTo(
            horizontalEllipseRadius = 2.0f,
            verticalEllipseRadius = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 2.0f,
            y1 = 9.17f,
          )
          // V 6
          verticalLineTo(y = 6.0f)
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
          // h 22z
          horizontalLineToRelative(dx = 22.0f)
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
      .also { _filterReset = it }
  }

@Suppress("ObjectPropertyName")
private var _filterReset: ImageVector? = null
